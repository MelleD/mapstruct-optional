package test.domain;

import java.util.Optional;

import org.springframework.lang.Nullable;
import org.springframework.util.ReflectionUtils;

public class OptionalHelper {

   public static void setEmptyIfNull( @Nullable final Object obj ) {
      if ( obj == null ) {
         return;
      }

      ReflectionUtils.doWithFields( obj.getClass(), field -> {
         final boolean wasAccessible = field.canAccess( obj );
         ReflectionUtils.makeAccessible( field );
         final Object value = field.get( obj );

         if ( field.getType().equals( Optional.class ) ) {
            if ( value == null ) {
               field.set( obj, Optional.empty() );
            } else {
               setEmptyIfNull( ((Optional<?>) value).orElse( null ) );
            }
         } else {
            if ( value != null ) {
               setEmptyIfNull( value );
            }
         }

         field.setAccessible( wasAccessible );
      } );
   }
}
package test.mapper;

import java.util.Optional;

import org.mapstruct.AfterMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

import test.domain.Foo;
import test.domain.OptionalHelper;
import test.dto.BarDto;
import test.dto.FooDto;

@Mapper(
      unmappedTargetPolicy = ReportingPolicy.IGNORE,
      nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
      injectionStrategy = InjectionStrategy.CONSTRUCTOR,
      uses = BarMapper.class
)
public interface FooMapper {

   Foo toFoo( FooDto fooDto );

   @AfterMapping
   default void mapEmptyIfNull( @MappingTarget final Foo foo ) {
      OptionalHelper.setEmptyIfNull( foo );
   }

   public static void main( final String[] args ) {
      FooDto fooDto = new FooDto( Optional.empty(), new BarDto( Optional.empty() ) );
      final FooMapperImpl fooMapperImpl = new FooMapperImpl();
      Foo foo = fooMapperImpl.toFoo( fooDto );
      System.out.println( foo.getBar() );
      System.out.println( foo.getBarObject().getBar() );

      fooDto = new FooDto( null, new BarDto( null ) );
      foo = fooMapperImpl.toFoo( fooDto );
      System.out.println( foo.getBar() );
      System.out.println( foo.getBarObject().getBar() );

      foo = fooMapperImpl.toFoo( null );
      System.out.println( foo.getBar() );
   }
}

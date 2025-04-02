package test.domain;

import java.util.Optional;

public class Foo {

   private Bar barObject;
   private Optional<String> bar;

   public Foo( final Optional<String> bar, final Bar barObject ) {
      this.bar = bar;
      this.barObject = barObject;
   }

   public void setBar( final Optional<String> bar ) {
      this.bar = bar;
   }

   public Optional<String> getBar() {
      return bar;
   }

   public void setBarObject( final Bar barObject ) {
      this.barObject = barObject;
   }

   public Bar getBarObject() {
      return barObject;
   }
}

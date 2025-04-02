package test.domain;

import java.util.Optional;

public class Foo {

   private Optional<String> bar;

   public Foo( final Optional<String> bar ) {
      this.bar = bar;
   }

   public void setBar( final Optional<String> bar ) {
      this.bar = bar;
   }

   public Optional<String> getBar() {
      return bar;
   }
}

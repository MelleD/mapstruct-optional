package test.domain;

import java.util.Optional;

public class Bar {

   private Optional<String> bar;

   public Bar( final Optional<String> bar ) {
      this.bar = bar;
   }

   public void setBar( final Optional<String> bar ) {
      this.bar = bar;
   }

   public Optional<String> getBar() {
      return bar;
   }
}

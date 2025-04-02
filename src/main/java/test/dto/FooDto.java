package test.dto;

import java.util.Optional;

public class FooDto {

   private Optional<String> bar;

   public FooDto( final Optional<String> bar ) {
      this.bar = bar;
   }

   public void setBar( final Optional<String> bar ) {
      this.bar = bar;
   }

   public Optional<String> getBar() {
      return bar;
   }
}

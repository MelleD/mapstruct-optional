package test.dto;

import java.util.Optional;

public class FooDto {

   private final BarDto barObject;
   private Optional<String> bar;

   public FooDto( final Optional<String> bar, final BarDto barObject ) {
      this.bar = bar;
      this.barObject = barObject;
   }

   public void setBar( final Optional<String> bar ) {
      this.bar = bar;
   }

   public Optional<String> getBar() {
      return bar;
   }

   public BarDto getBarObject() {
      return barObject;
   }
}

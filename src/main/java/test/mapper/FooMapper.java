package test.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

import test.domain.Foo;
import test.dto.FooDto;

@Mapper(
      unmappedTargetPolicy = ReportingPolicy.IGNORE,
      nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
      injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface FooMapper {

   Foo toFoo( FooDto fooDto );
}

package test.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

import test.domain.Bar;
import test.dto.BarDto;

@Mapper(
      unmappedTargetPolicy = ReportingPolicy.IGNORE,
      nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
      injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface BarMapper {

   Bar toBar( BarDto barDto );

}

package test.mapper;

import java.util.Optional;
import javax.annotation.processing.Generated;
import test.domain.Bar;
import test.dto.BarDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-02T13:36:31+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.5 (Eclipse Adoptium)"
)
public class BarMapperImpl implements BarMapper {

    @Override
    public Bar toBar(BarDto barDto) {

        Optional<String> bar = null;
        if ( barDto != null ) {
            bar = barDto.getBar();
        }

        Bar bar1 = new Bar( bar );

        return bar1;
    }
}

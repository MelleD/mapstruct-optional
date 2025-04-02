package test.mapper;

import java.util.Optional;
import javax.annotation.processing.Generated;
import org.mapstruct.factory.Mappers;
import test.domain.Bar;
import test.domain.Foo;
import test.dto.FooDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-02T13:36:57+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class FooMapperImpl implements FooMapper {

    private final BarMapper barMapper = Mappers.getMapper( BarMapper.class );

    @Override
    public Foo toFoo(FooDto fooDto) {

        Optional<String> bar = null;
        Bar barObject = null;
        if ( fooDto != null ) {
            bar = fooDto.getBar();
            barObject = barMapper.toBar( fooDto.getBarObject() );
        }

        Foo foo = new Foo( bar, barObject );

        mapEmptyIfNull( foo );

        return foo;
    }
}

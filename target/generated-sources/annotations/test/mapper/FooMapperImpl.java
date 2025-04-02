package test.mapper;

import java.util.Optional;
import javax.annotation.processing.Generated;
import test.domain.Foo;
import test.dto.FooDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-02T12:51:12+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.5 (Eclipse Adoptium)"
)
public class FooMapperImpl implements FooMapper {

    @Override
    public Foo toFoo(FooDto fooDto) {

        Optional<String> bar = null;
        if ( fooDto != null ) {
            bar = fooDto.getBar();
        }

        Foo foo = new Foo( bar );

        return foo;
    }
}

package com.jbt.dto.mappers;

import com.jbt.dto.MockDto;
import com.jbt.model.Mock;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-05T10:01:01+0300",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class MockMapperImpl implements MockMapper {

    @Override
    public MockDto mockToDto(Mock mock) {
        if ( mock == null ) {
            return null;
        }

        MockDto mockDto = new MockDto();

        mockDto.setTestMock( String.valueOf( mock.getExample() ) );

        return mockDto;
    }
}

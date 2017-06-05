package com.jbt.dto.mappers;

import com.jbt.dto.MockDto;
import com.jbt.model.Mock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MockMapper {

    MockMapper INSTANSE = Mappers.getMapper(MockMapper.class);

    @Mapping(source = "example", target = "testMock")
    MockDto mockToDto(Mock mock);
}

package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.response.CarResponse;
import com.example.mapstruct.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper
{
    @Mapping(source = "engine.horsepower", target = "horsepower")
    CarResponse toCarResonse(Car car);

}

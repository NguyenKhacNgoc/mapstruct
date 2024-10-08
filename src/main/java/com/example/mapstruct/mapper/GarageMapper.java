package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.response.GarageResponse;
import com.example.mapstruct.entity.Garage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CarMapper.class)
public interface GarageMapper
{
    GarageResponse toGarageResponse(Garage garage);

}

package com.example.mapstruct.dto.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarResponse
{
    private String make;
    private String model;
    private int horsepower;
}

package com.paw.msdemo.model.MapStruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ICarMapper {
    ICarMapper INSTANCE = Mappers.getMapper(ICarMapper.class);
    @Mapping(source = "numberOfSeats", target="seatCount")
    @Mapping(source = "make", target="make")
    @Mapping(source = "carType", target="carType")
    CarDto carToCarDto(Car car);
}

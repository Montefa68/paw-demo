package com.paw.msdemo.model.MapStruct;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-27T12:13:24+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
public class ICarMapperImpl implements ICarMapper {

    @Override
    public CarDto carToCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        if ( car.getCarType() != null ) {
            carDto.setCarType( car.getCarType().name() );
        }
        carDto.setSeatCount( car.getNumberOfSeats() );
        carDto.setMake( car.getMake() );

        return carDto;
    }
}

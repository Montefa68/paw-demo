package com.paw.msdemo.model;

import com.paw.msdemo.model.MapStruct.Car;
import com.paw.msdemo.model.MapStruct.CarDto;
import com.paw.msdemo.model.MapStruct.CarType;
import com.paw.msdemo.model.MapStruct.ICarMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MapStructCarToCarDtoTest {
    @Test
    public void TestThatDtoIsCar() {
        //given
        Car car = new Car("Morris", 5, CarType.SEDAN);

        //when
        CarDto carDto = ICarMapper.INSTANCE.carToCarDto(car);

        //then
        assertNotNull(carDto);
        assertEquals(carDto.getMake(),"Morris");
       assertEquals(carDto.getSeatCount(),5);
      assertEquals(carDto.getCarType(),"SEDAN");
    }
}

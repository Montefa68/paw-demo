package com.paw.msdemo.controller;

import com.paw.msdemo.model.DataClass;
import com.paw.msdemo.model.MapStruct.Car;
import com.paw.msdemo.model.MapStruct.CarType;
import com.paw.msdemo.service.CarMongoRepositoryService;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

@RestController
@Api(value ="Demo Service")

public class DemoService {

    private final CarMongoRepositoryService carMongoRepositoryService;

    public DemoService(CarMongoRepositoryService carMongoRepositoryService){
        this.carMongoRepositoryService = carMongoRepositoryService;
    }

    @GetMapping("/lista/{name}/{id}")
    @ApiOperation(value = "Get an employee by Id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<List<DataClass>> List(@ApiParam(value = "Name of the Person", required = true) @PathVariable String name, @ApiParam(value = "ID of the Person", required = true) @PathVariable int id) {
        return ResponseEntity.ok().body(Collections.singletonList(DataClass.Create(name, id)));
    }

    @GetMapping("/addCar/{make}/{numberOfSeats}/{carType}")
    @ApiOperation(value = "Adds a Car MongoDB")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<Car> AddCar(@ApiParam(value="Make Of Car", required=true) @PathVariable String make
    , @ApiParam(value="Number of Seats", required=true) @PathVariable int numberOfSeats, @ApiParam(value="Car Type", required=true) @PathVariable String carType)
    {
        Car car = new Car(make,numberOfSeats, CarType.valueOf(carType));
        return ResponseEntity.ok().body(carMongoRepositoryService.SaveCar(car));
    }

    @GetMapping("/listCar/")
    @ApiOperation(value = "Get a list of Cars from MongoDB")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<List<Car>> ListCar() {
        return ResponseEntity.ok().body(carMongoRepositoryService.findAllCars());
    }
}

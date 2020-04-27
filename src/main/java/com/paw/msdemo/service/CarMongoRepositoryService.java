package com.paw.msdemo.service;

import com.paw.msdemo.model.MapStruct.Car;
import com.paw.msdemo.model.MapStruct.ICarMongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMongoRepositoryService {
    private final ICarMongoRepository carMongoRepository;

    public CarMongoRepositoryService(ICarMongoRepository iCarMongoRepository)
    {
        this.carMongoRepository = iCarMongoRepository;
    }

    public Car SaveCar(Car car){
        return carMongoRepository.save(car);
    }
    public List<Car> findAllCars(){return carMongoRepository.findAll();}
}

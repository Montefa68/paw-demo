package com.paw.msdemo.model.MapStruct;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface ICarMongoRepository extends MongoRepository<Car, String> {
}

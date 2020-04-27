package com.paw.msdemo.model.MapStruct;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document //Spring framework Mongodb Document mapping
@Data //lombok Data Class
@Builder //lombok Builder Class
 public class Car {

    @Id //Spring framework Data annotation
    private String id;
    private String make;
    private int numberOfSeats;
    private CarType carType;

     public Car(String make, int numberOfSeats, CarType carType) {
         this.setMake(make);
         this.setNumberOfSeats(numberOfSeats);
         this.setCarType(carType);
     }

     public int getNumberOfSeats() {
         return numberOfSeats;
     }

     public void setNumberOfSeats(int numberOfSeats) {
         this.numberOfSeats = numberOfSeats;
     }

     public String getMake() {
         return make;
     }

     public void setMake(String make) {
         this.make = make;
     }

     public CarType getCarType() {
         return carType;
     }

     public void setCarType(CarType carType) {
         this.carType = carType;
     }
 }

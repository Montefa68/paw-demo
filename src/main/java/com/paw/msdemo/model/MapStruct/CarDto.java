package com.paw.msdemo.model.MapStruct;

public class CarDto {
    private String make;
    private int seatCount;
    private String carType;

    public CarDto(){}

    public CarDto(String make, int seatCount, String carType)
    {
        this.make = make;
        this.seatCount = seatCount;
        this.carType = carType;
    }

    public String getMake() {
        return this.make;
    }
    public int getSeatCount()
    {
        return this.seatCount;
    }
    public void setSeatCount(int seatCount)
    {
        this.seatCount = seatCount;
    }


    public String getType() {
        return this.getType();
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

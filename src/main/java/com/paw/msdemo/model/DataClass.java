package com.paw.msdemo.model;

public class DataClass {

    private final String name;
    private final int id;

    public static DataClass Create(String name, int id)
    {
        return new DataClass(name,id);
    }
    private DataClass(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

}
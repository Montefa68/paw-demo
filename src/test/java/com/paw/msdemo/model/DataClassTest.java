package com.paw.msdemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataClassTest {

    @Test
    void create() {
        DataClass dataClass = DataClass.Create("paolo",1);
        assertEquals(dataClass.getName(),"paolo");
    }

    @Test
    void getName() {
    }

    @Test
    void getId() {
    }
}
package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FelineTestGetFamilyValue {

    @Test
    public void FelineTestGetFamilyValidValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());

    }

}



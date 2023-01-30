package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FelineTestGetKittensValue {

    @Test
    public void FelineTestGetKittensWithoutArgumentValueReturnValidValue() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());

    }

    @Test
    public void FelineTestGetKittensWithArgumentValueReturnValidValue() {
        final int argument = (int) Math.random();
        Feline feline = new Feline();
        assertEquals(argument, feline.getKittens(argument));

    }

}



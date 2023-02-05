package com.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class FelineTest {

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

    @Test
    public void FelineTestEatMeatValidValue() throws Exception {
        ArrayList<String> result = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));

        Feline feline = new Feline();
        assertEquals(result, feline.eatMeat());

    }

    @Test
    public void FelineTestGetFamilyValidValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());

    }

}



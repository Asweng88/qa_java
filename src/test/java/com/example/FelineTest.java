package com.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void felineTestGetKittensWithoutArgumentValueReturnValidValue() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());

    }

    @Test
    public void felineTestGetKittensWithArgumentValueReturnValidValue() {
        final int argument = (int) Math.random();
        Feline feline = new Feline();
        assertEquals(argument, feline.getKittens(argument));
    }

    @Test
    public void felineTestEatMeatValidValue() throws Exception {
        ArrayList<String> result = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));

        Feline feline = new Feline();
        assertEquals(result, feline.eatMeat());

    }

    @Test
    public void felineTestGetFamilyValidValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());

    }

}



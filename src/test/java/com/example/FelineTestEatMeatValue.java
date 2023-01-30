package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;


public class FelineTestEatMeatValue {

    @Test
    public void FelineTestEatMeatValidValue() throws Exception {
        Feline feline = new Feline();
        assertEquals("[Животные, Птицы, Рыба]", feline.eatMeat().toString());

    }

}



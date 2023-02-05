package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTestGetFootAndKittensValue {

    @Mock
    Feline feline;

    @Test
    public void LionTestGetFootValidValue() throws Exception {
        ArrayList<String> result = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion(feline);
        Mockito.when(feline.eatMeat()).thenReturn(result);
        assertEquals(result, lion.getFood());
    }

    @Test
    public void LionTestGetKittensValidValue() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());

    }


}



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
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void CatTestGetFootValidValue() throws Exception {
        ArrayList<String> result = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(result);
        assertEquals(result, cat.getFood());
    }

    @Test
    public void CatTestGetSoundValidValue() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());

    }


}



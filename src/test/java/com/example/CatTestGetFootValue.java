package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTestGetFootValue {

    @Mock
    Feline feline;

    @Test
    public void CatTestGetFootValidValue() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(Collections.singletonList("Животные, Птицы, Рыба"));
        assertEquals("[Животные, Птицы, Рыба]", cat.getFood().toString());

    }

}



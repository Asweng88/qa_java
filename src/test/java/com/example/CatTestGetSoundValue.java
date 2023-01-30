package com.example;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTestGetSoundValue {

    @Mock
    Feline feline;

    @Test
    public void CatTestGetSoundValidValue() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());

    }

}



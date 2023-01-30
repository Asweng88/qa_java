package com.example;

import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTestGetFootValue {

    @Mock
    Predator predator;

    @Test
    public void LionReturnValidValue() throws Exception {
        Lion lion = new Lion(predator);
        Mockito.when(lion.getFood()).thenReturn(Collections.singletonList("Животные, Птицы, Рыба"));
        assertEquals("[Животные, Птицы, Рыба]", lion.getFood().toString());

    }

}



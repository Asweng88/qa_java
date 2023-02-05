package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestSexException {

    private final String sex;
    private final String exceptions;

    public LionTestSexException(String sex, String exceptions){
        this.sex=sex;
        this.exceptions = exceptions;
    }

    @Parameterized.Parameters
    public static Object[][] sex() {
        //Сгенерируй тестовые данные
        return new Object[][] {
                {"Неизветен","Используйте допустимые значения пола животного - самец или самка"},
                {null, "Используйте допустимые значения пола животного - самец или самка"},
        };
    }


    @Test
    public void LionReturnExceptionValue() throws Exception {
        AtomicReference<Lion> lion = null;


        Exception exception = Assert.assertThrows("Проверка exception", Exception.class, () -> lion.set(new Lion(sex)));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());

    }

}



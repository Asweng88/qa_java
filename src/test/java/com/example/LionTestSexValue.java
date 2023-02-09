package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestSexValue {

    private final String sex;
    private final boolean value;

    public LionTestSexValue(String sex, boolean value){
        this.sex=sex;
        this.value=value;
    }

    @Parameterized.Parameters
    public static Object[][] sex() {
        //Сгенерируй тестовые данные
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionReturnValidValue() throws Exception {
        Predator feline = new Feline();
        Lion lion = new Lion((Feline) feline, sex);

        System.out.println(lion.doesHaveMane());
        assertEquals(value, lion.doesHaveMane());

    }

}



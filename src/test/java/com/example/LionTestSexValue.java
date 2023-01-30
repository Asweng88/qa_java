package com.example;
import com.example.Lion;
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
    public void LionReturnValidValue() throws Exception {
        Lion lion = new Lion(sex);
        System.out.println(lion.doesHaveMane());
        assertEquals(value, lion.doesHaveMane());

    }

}



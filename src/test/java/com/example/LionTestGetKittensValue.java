package lion;
import com.example.Kittens;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTestGetKittensValue {

    @Mock
    Kittens kittens;

    @Test
    public void LionReturnValidValue() {
        Lion lion = new Lion(kittens);
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());

    }

}



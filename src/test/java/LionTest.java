import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import com.example.Lion;
import com.example.Feline;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
public class LionTest {
    Feline feline = new Feline();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getFoodTestHerbivore() throws Exception {
        Lion objLion = Mockito.mock(Lion.class);
        Mockito.when(objLion.getFood()).thenReturn(feline.getFood("Травоядное"));
        assertEquals(List.of("Трава", "Различные растения"), objLion.getFood());
    }
    @Test
    public void getFoodTestPredator() throws Exception {
        Lion objLion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), objLion.getFood());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertEquals(1, lion.getKittens());
    }
    @Test(expected = Exception.class)
    public void getFoodTestWithException() throws Exception {
        Lion objLion = Mockito.mock(Lion.class);
        Mockito.when(objLion.getFood()).thenReturn(feline.getFood("Насекомое"));
        objLion.getFood();
    }

    @Test(expected = Exception.class)
    public void testDoesHaveManeWithException() throws Exception {
        Lion objLion = new Lion("Ребёнок", feline);
        objLion.doesHaveMane();
    }

}
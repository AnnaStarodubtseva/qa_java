import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void testGetSound() {
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}


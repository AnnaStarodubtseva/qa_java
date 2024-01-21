import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import com.example.Feline;
public class FelineTest {
    Feline feline = new Feline();
    public void testEatMeat() {
        try {
            List<String> food = feline.eatMeat();
            assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGetFamily() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }
    @Test
    public void testGetKittens() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }
    @Test
    public void testGetKittensWithCount() {
        int kittens = feline.getKittens(3);
        assertEquals(3, kittens);
    }
}

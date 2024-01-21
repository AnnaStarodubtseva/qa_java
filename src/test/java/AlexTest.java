import static org.junit.Assert.*;
import org.junit.Test;
import com.example.Alex;
import com.example.Feline;
import java.util.Arrays;
import java.util.List;

public class AlexTest {
    Alex alex = new Alex("Самец", new Feline());

    public AlexTest() throws Exception {
    }
    @Test
    public void testGetFriends() {
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void testGetPlaceOfLiving() {
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = alex.getPlaceOfLiving();
        assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void testGetKittens() {
        int expectedKittens = 0;
        int actualKittens = alex.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }
}
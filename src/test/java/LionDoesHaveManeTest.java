import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Lion;
import com.example.Feline;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    private final String gender;
    private final boolean result;
    Feline feline = new Feline();
    public LionDoesHaveManeTest(String gender, boolean result) {
        this.gender = gender;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Object[][] getDate() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void testDoesHaveMane() throws Exception {
        Lion objLion = new Lion(gender, feline);
        assertEquals(result, objLion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void testDoesHaveManeWithException() throws Exception {
        Lion objLion = new Lion("Ребёнок", feline);
        assertEquals(result, objLion.doesHaveMane());
    }

}
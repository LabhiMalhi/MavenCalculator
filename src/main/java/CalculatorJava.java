import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorJava {
    CalC cl = new CalC();

    @Test
    public void sumTest(){
        Assertions.assertEquals(2, cl.sum(1, 1));
    }
}

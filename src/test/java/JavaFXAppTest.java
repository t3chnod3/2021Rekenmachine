import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void computeAddTest() {
        AddComputation add = new AddComputation();
        int result = add.compute(16, 16);
        assertEquals(32,result);
    }
    @Test
    void computeMultiplyTest() {
        MultiplyComputation multi = new MultiplyComputation();
        int result = multi.compute(16, 16);
        assertEquals(256,result);
    }
    @Test
    void computeDivideTest() {
        DivideComputation div = new DivideComputation();
        int result = div.compute(16, 16);
        assertEquals(1,result);
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class JavaFXAppTest {

    @Test
    void computeAddTest() {
        JavaFXApp java = new JavaFXApp();

        int result = java.computeAdd(4, 4);
        assertEquals(8,result);
    }


    @Test
    void computeMultiplyTest() {
        JavaFXApp java = new JavaFXApp();

        int result = java.computeMultiply(16, 16);
        assertEquals(256,result);
    }


}
import org.junit.Test;
import static org.junit.Assert.*;
public class ONPTest {
    @Test
    public void ONPTestReturnedValue(){
        String equation = "(2 + 4) * (4 - 6) =";
        String ONPEquation = ONP.toONP(equation);
        // Delta attribute is used to define the maximum delta between the expected and the actual value
        assertEquals(-12.0, ONP.evaluateONP(ONPEquation), 0);

        String equation2 = "5 * ((3 - 7) * 2 - 3 * (5 + 1)) - 3 =";
        String ONPEquation2 = ONP.toONP(equation2);
        assertEquals(-133.0, ONP.evaluateONP(ONPEquation2), 0);

        System.out.println("Returned value test passed");

    }
    @Test
    public void ONPTestConvertedForm(){
        String equation = "(2 + 4) * (4 - 6) =";
        String result1 = "24+46-*";

        assertEquals("Equation converted to ONP form doesnt match the result", ONP.toONP(equation), result1);

        String equation2 = "5 * ((3 - 7) * 2 - 3 * (5 + 1)) - 3 =";
        String result2 = "537-2*351+*-*3-";

        assertEquals("Equation converted to ONP form doesnt match the result", ONP.toONP(equation2), result2);

        System.out.println("Converted form test passed");
    }
    @Test
    public void ONPTestOperations(){

    }
}

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;
import taskOne.MainTaskOne;
import taskThree.MainTaskThree;
import taskTwo.MainTaskTwo;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SyntaxTest {

    @SuppressWarnings("unused")
    private List<String> non_incorrect_parameters(){
        return Arrays.asList("(1+2)*3\n", "42+17\n", "10*2/2+4\n", "10*2/(2+4)\n", "42\n");
    }

    @SuppressWarnings("unused")
    private List<String> incorrect_parameters(){
        return Arrays.asList("(1+2*3\n", "10*/2+4\n", "2++2)\n", "()\n");
    }

    @org.junit.Test
    @Parameters(method = "non_incorrect_parameters")
    public void test_non_incorrect_Params(String input){
        assertEquals(0, MainTaskOne.checkSyntax(input));
        assertEquals(0, MainTaskTwo.checkSyntax(input));
        assertEquals(0, MainTaskThree.checkSyntax(input));
    }

    @org.junit.Test
    @Parameters(method = "incorrect_parameters")
    public void test_incorrect_Params(String input){
        assertNotEquals(0, MainTaskOne.checkSyntax(input));
        assertNotEquals(0, MainTaskTwo.checkSyntax(input));
        assertNotEquals(0, MainTaskThree.checkSyntax(input));
    }

}
import TaskGrammarAction.TaskGrammarAction;
import TaskParseTreeListener.TaskParseTreeListener;
import TaskParserTreeVisitor.TaskParseTreeVisitor;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class SyntaxControlledInterpreterTest {

    @SuppressWarnings("unused")
    private Object[] correct_parameters(){
        return new Object[] {
                new Object[] {"5+2\n", "7"},
                new Object[] {"5-2\n", "3"},
                new Object[] {"3-7*2\n", "-11"},
                new Object[] {"9-5+2\n", "6"},
                new Object[] {"9-5*2\n", "-1"},
                new Object[] {"42-42\n", "0"},
                new Object[] {"(3-7)*2\n", "-8"},
                new Object[] {"5*(1+1)\n", "10"},
                new Object[] {"2*(5*(1+1))\n", "20"},
                new Object[] {"(4-1)*(2+2)\n", "12"},
                new Object[] {"4/2\n", "2"},
                new Object[] {"2^2^3\n", "256"},
                new Object[] {"2^2*2\n", "8"},
                new Object[] {"5+5^2\n", "30"},
                new Object[] {"(5+5)^2\n", "100"},
                new Object[] {"3<5^2\n", "1"},
                new Object[] {"2^8<10\n", "0"},
                new Object[] {"4*4==2*8\n", "1"},
                new Object[] {"a=5+2\na+7\n", "14"},
                new Object[] {"clear\n", "0"},
                new Object[] {"42==42?1:0\n", "1"},
                new Object[] {"42<29?1:0\n", "0"},
                new Object[] {"9<42?42-1:2*2\n", "41"},
        };
    }

    @SuppressWarnings("unused")
    private List<String> incorrect_parameters(){
        return Arrays.asList("(42\n", "(1+2*3\n", "10*/2+4\n", "2++2)\n", "()\n");
    }

    @SuppressWarnings("unused")
    private Object parameters_if_else(){
        return new Object[] {
                new Object[] {"if (2==2) 1 else 0\n", "1"},
                new Object[] {"if (42>13) 42*2 else 42-32\n", "84"}
        };
    }

    @org.junit.Test
    @Parameters(method = "incorrect_parameters")
    public void test_ParseTreeVisitor_correct_parameters(String input){
        Assert.assertNotEquals(0, new TaskParseTreeVisitor().checkSyntax(input));
    }

    @org.junit.Test
    @Parameters(method = "incorrect_parameters")
    public void test_GrammarAction_correct_parameters(String input){
        Assert.assertNotEquals(0, new TaskGrammarAction().checkSyntax(input));
    }

    @org.junit.Test
    @Parameters(method = "incorrect_parameters")
    public void test_ParseTreeListener_correct_parameters(String input){
        Assert.assertNotEquals(0, new TaskParseTreeListener().checkSyntax(input));
    }

    @org.junit.Test
    @Parameters(method = "correct_parameters")
    public void test_ParseTreeVisitor_correct_parameters(String input, String result){
        TaskParseTreeVisitor taskParseTreeVisitor = new TaskParseTreeVisitor();
        Assume.assumeTrue(0 == taskParseTreeVisitor.checkSyntax(input));
        Assert.assertEquals(Integer.parseInt(result), taskParseTreeVisitor.getResult());
    }

    @org.junit.Test
    @Parameters(method = "correct_parameters")
    public void test_GrammarAction_correct_parameters(String input, String result){
        TaskGrammarAction taskGrammarAction = new TaskGrammarAction();
        Assume.assumeTrue(0 == taskGrammarAction.checkSyntax(input));
        Assert.assertEquals(Integer.parseInt(result), taskGrammarAction.getResult());
    }

    @org.junit.Test
    @Parameters(method = "correct_parameters")
    public void test_ParseTreeListener_correct_parameters(String input, String result){
        TaskParseTreeListener taskParseTreeListener = new TaskParseTreeListener();
        Assume.assumeTrue(0 == taskParseTreeListener.checkSyntax(input));
        Assert.assertEquals(Integer.parseInt(result), taskParseTreeListener.getResult());
    }

    @org.junit.Test
    @Parameters(method = "parameters_if_else")
    public void test_if_else_GrammarAction(String input, String result){
        TaskGrammarAction taskGrammarAction = new TaskGrammarAction();
        Assume.assumeTrue(0 == taskGrammarAction.checkSyntax(input));
        Assert.assertEquals(Integer.parseInt(result), taskGrammarAction.getResult());
    }

}
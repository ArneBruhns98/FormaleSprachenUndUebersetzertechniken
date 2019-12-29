import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class AFSMImplTest {

    @SuppressWarnings("unused")
    private Object[] params_firstAFSM() {
        return new Object[]{
                new Object[]{"bab"},
                new Object[]{"ab"},
                new Object[]{"ababa"}
        };
    }

    @SuppressWarnings("unused")
    private Object[] params_secondASFM() {
        return new Object[]{
                new Object[]{"a"},
                new Object[]{"aa"},
                new Object[]{"aaa"}
        };
    }

    @SuppressWarnings("unused")
    private Object[] params_thirdASFM() {
        return new Object[]{
                new Object[]{"aaa"},
                new Object[]{"bbb"},
                new Object[]{"aba"}
        };
    }

    @Test
    @Parameters(method = "params_firstAFSM")
    public void test_firstAFSM(String inputs){
        List<String> input = List.of(inputs.split(""));

        AFSMCreator creator = new AFSMCreator();
        creator.createFirstAFSM();

        AFSMInterpreter interpreter = new AFSMInterpreter();

        Assert.assertEquals(input, interpreter.run(creator.creator, input));
        Assert.assertTrue(interpreter.state.isAccepted());
    }

    @Test
    @Parameters(method = "params_secondASFM")
    public void test_secondAFSM(String inputs){
        List<String> input = List.of(inputs.split(""));

        AFSMCreator creator = new AFSMCreator();
        creator.createSecondAFSM();

        AFSMInterpreter interpreter = new AFSMInterpreter();

        Assert.assertEquals(input, interpreter.run(creator.creator, input));
        Assert.assertTrue(interpreter.state.isAccepted());
    }

    @Test
    @Parameters(method = "params_thirdASFM")
    public void test_thirdAFSM(String inputs){
        List<String> input = List.of(inputs.split(""));

        AFSMCreator creator = new AFSMCreator();
        creator.createThirdAFSM();

        AFSMInterpreter interpreter = new AFSMInterpreter();

        Assert.assertEquals(input, interpreter.run(creator.creator, input));
        Assert.assertTrue(interpreter.state.isAccepted());
    }

}
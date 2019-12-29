import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.io.IOException;

@RunWith(JUnitParamsRunner.class)
public class CallGraphGreaterTest {

    @SuppressWarnings("unused")
    private Object[] params() {
        return new Object[]{
                new Object[]{"./src/main/resources/rec.cymbol", ResultDates.REC_CYMBOL},
                new Object[]{"./src/main/resources/t.cymbol", ResultDates.T_CYMBOL},
        };
    }

    @org.junit.Test
    @Parameters(method = "params")
    public void test_syntax(String filename, String result) throws IOException {
        Assert.assertEquals(0, new CallGraphGreater().checkSyntax(new FileInputStream(filename)));
    }

    @org.junit.Test
    @Parameters(method = "params")
    public void test_graph(String filename, String result) throws IOException {
        CallGraphGreater callGraphGreater = new CallGraphGreater();
        Assume.assumeTrue(0 == callGraphGreater.checkSyntax(new FileInputStream(filename)));
        Assert.assertEquals(result.replaceAll("\r", ""), callGraphGreater.createCallGraph().replaceAll("\r", ""));

    }

}


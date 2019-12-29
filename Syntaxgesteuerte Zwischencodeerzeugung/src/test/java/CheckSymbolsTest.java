import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.io.IOException;

@RunWith(JUnitParamsRunner.class)
public class CheckSymbolsTest {

    @SuppressWarnings("unused")
    private Object[] params_SymTable() {
        return FileImporter.getFiles_SymTable();
    }

    @SuppressWarnings("unused")
    private Object[] params_LLVM() {
        return FileImporter.getFiles_LLVM();
    }

    @org.junit.Test
    @Parameters(method = "params_SymTable")
    public void test_syntax(String filename, String result) throws IOException {
        Assert.assertEquals(0, new CheckSymbols().checkSyntax(new FileInputStream(filename)));
    }

    @org.junit.Test
    @Parameters(method = "params_SymTable")
    public void test_symTable(String filename, String result) throws Exception {
        CheckSymbols checkSymbols = new CheckSymbols();
        checkSymbols.createSymTable(new FileInputStream(filename));
        Assert.assertEquals(result, checkSymbols.outContent.toString().replaceAll("\r", ""));
    }

    @org.junit.Test
    @Parameters(method = "params_LLVM")
    public void test_LLVM(String filename, String result) throws Exception {
        CheckSymbols checkSymbols = new CheckSymbols();
        checkSymbols.process(new FileInputStream(filename));
        Assert.assertEquals(Integer.parseInt(result), checkSymbols.exitValue);
        Assert.assertNull(checkSymbols.bufferedReader_process_errorStream.readLine());
    }

}
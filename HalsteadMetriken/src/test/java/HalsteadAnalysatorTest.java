import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HalsteadAnalysatorTest {

    private HalsteadAnalysator createHalSteadAnalysator(){
        return new HalsteadAnalysator();
    }

    @Test
    public void test_ggt1() throws IOException {
        HalsteadAnalysator halsteadAnalysator = createHalSteadAnalysator();
        halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/ggt1.c");
        halsteadAnalysator.determineParametersAndMetrics();

        Map<String, Integer> expected_operators = new TreeMap<>();
        expected_operators.put("!=", 1);
        expected_operators.put("(", 1);
        expected_operators.put(",", 1);
        expected_operators.put("-=", 2);
        expected_operators.put(";", 3);
        expected_operators.put(">", 1);
        expected_operators.put("else", 1);
        expected_operators.put("if (", 1);
        expected_operators.put("return", 1);
        expected_operators.put("while (", 1);
        expected_operators.put("{", 2);


        Map<String, Integer> expected_operands = new TreeMap<>();
        expected_operands.put("ggt1", 1);
        expected_operands.put("int", 3);
        expected_operands.put("x", 6);
        expected_operands.put("y", 5);

        Assert.assertEquals(expected_operators, halsteadAnalysator.operators);
        Assert.assertEquals(expected_operands, halsteadAnalysator.operands);

        Assert.assertEquals(15, halsteadAnalysator.N1);
        Assert.assertEquals(15, halsteadAnalysator.N2);
        Assert.assertEquals(11, halsteadAnalysator.n1);
        Assert.assertEquals(4, halsteadAnalysator.n2);
        Assert.assertEquals(30, halsteadAnalysator.N);
        Assert.assertEquals(15, halsteadAnalysator.n);
        Assert.assertEquals(117, (int) halsteadAnalysator.V);
        Assert.assertEquals(15, (int) halsteadAnalysator.D);
        Assert.assertEquals(1758, (int) halsteadAnalysator.E);
    }

    @Test
    public void test_ggt2() throws IOException {
        HalsteadAnalysator halsteadAnalysator = createHalSteadAnalysator();
        halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/ggt2.c");
        halsteadAnalysator.determineParametersAndMetrics();

        Map<String, Integer> expected_operators = new TreeMap<>();
        expected_operators.put("!=", 1);
        expected_operators.put("%", 1);
        expected_operators.put("(", 1);
        expected_operators.put(",", 1);
        expected_operators.put(";", 6);
        expected_operators.put("=", 3);
        expected_operators.put("return", 1);
        expected_operators.put("while (", 1);
        expected_operators.put("{", 2);


        Map<String, Integer> expected_operands = new TreeMap<>();
        expected_operands.put("0", 1);
        expected_operands.put("ggt2", 1);
        expected_operands.put("int", 4);
        expected_operands.put("r", 3);
        expected_operands.put("x", 4);
        expected_operands.put("y", 5);

        Assert.assertEquals(expected_operators, halsteadAnalysator.operators);
        Assert.assertEquals(expected_operands, halsteadAnalysator.operands);

        Assert.assertEquals(17, halsteadAnalysator.N1);
        Assert.assertEquals(18, halsteadAnalysator.N2);
        Assert.assertEquals(9, halsteadAnalysator.n1);
        Assert.assertEquals(6, halsteadAnalysator.n2);
        Assert.assertEquals(35, halsteadAnalysator.N);
        Assert.assertEquals(15, halsteadAnalysator.n);
        Assert.assertEquals(136, (int) halsteadAnalysator.V);
        Assert.assertEquals(12, (int) halsteadAnalysator.D);
        Assert.assertEquals(1640, (int) halsteadAnalysator.E);
    }

    @Test
    public void test_exctract() throws IOException {
        HalsteadAnalysator halsteadAnalysator = createHalSteadAnalysator();
        halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/extract.c");
        halsteadAnalysator.determineParametersAndMetrics();

        Map<String, Integer> expected_operators = new TreeMap<>();
        expected_operators.put("'", 2);
        expected_operators.put("(", 1);
        expected_operators.put("*", 5);
        expected_operators.put("+", 1);
        expected_operators.put("++", 3);
        expected_operators.put(",", 3);
        expected_operators.put(";", 8);
        expected_operators.put("<", 1);
        expected_operators.put("=", 4);
        expected_operators.put("while (", 1);
        expected_operators.put("{", 2);


        Map<String, Integer> expected_operands = new TreeMap<>();
        expected_operands.put("0", 1);
        expected_operands.put("anfang", 2);
        expected_operands.put("char", 2);
        expected_operands.put("extract", 1);
        expected_operands.put("i", 4);
        expected_operands.put("int", 3);
        expected_operands.put("n", 1);
        expected_operands.put("nb", 2);
        expected_operands.put("void", 1);
        expected_operands.put("zeichenkette1", 5);
        expected_operands.put("zeichenkette2", 4);


        Assert.assertEquals(expected_operators, halsteadAnalysator.operators);
        Assert.assertEquals(expected_operands, halsteadAnalysator.operands);

        Assert.assertEquals(31, halsteadAnalysator.N1);
        Assert.assertEquals(26, halsteadAnalysator.N2);
        Assert.assertEquals(11, halsteadAnalysator.n1);
        Assert.assertEquals(11, halsteadAnalysator.n2);
        Assert.assertEquals(57, halsteadAnalysator.N);
        Assert.assertEquals(22, halsteadAnalysator.n);
        Assert.assertEquals(254, (int) halsteadAnalysator.V);
        Assert.assertEquals(10, (int) halsteadAnalysator.D);
        Assert.assertEquals(2541, (int) halsteadAnalysator.E);
    }

    @Test
    public void test_main() throws IOException {
        HalsteadAnalysator halsteadAnalysator = createHalSteadAnalysator();
        halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/main.c");
        halsteadAnalysator.determineParametersAndMetrics();

        Map<String, Integer> expected_operators = new TreeMap<>();
        expected_operators.put("!=", 1);
        expected_operators.put("(", 4);
        expected_operators.put("*", 2);
        expected_operators.put(",", 2);
        expected_operators.put(";", 4);
        expected_operators.put("=", 1);
        expected_operators.put("[", 1);
        expected_operators.put("else", 1);
        expected_operators.put("if (", 1);
        expected_operators.put("{", 3);


        Map<String, Integer> expected_operands = new TreeMap<>();
        expected_operands.put("\"Das Ergebnis der Berechnung ist : %d\"", 1);
        expected_operands.put("\"Error, Nutzung des Programms : eval1 <expression>\"", 1);
        expected_operands.put("1", 1);
        expected_operands.put("2", 1);
        expected_operands.put("argc", 2);
        expected_operands.put("argv", 2);
        expected_operands.put("char", 1);
        expected_operands.put("eval1", 1);
        expected_operands.put("int", 3);
        expected_operands.put("main", 1);
        expected_operands.put("printf", 2);
        expected_operands.put("res", 3);


        Assert.assertEquals(expected_operators, halsteadAnalysator.operators);
        Assert.assertEquals(expected_operands, halsteadAnalysator.operands);

        Assert.assertEquals(20, halsteadAnalysator.N1);
        Assert.assertEquals(19, halsteadAnalysator.N2);
        Assert.assertEquals(10, halsteadAnalysator.n1);
        Assert.assertEquals(12, halsteadAnalysator.n2);
        Assert.assertEquals(39, halsteadAnalysator.N);
        Assert.assertEquals(22, halsteadAnalysator.n);
        Assert.assertEquals(173, (int) halsteadAnalysator.V);
        Assert.assertEquals(5, (int) halsteadAnalysator.D);
        Assert.assertEquals(869, (int) halsteadAnalysator.E);
    }

    @Test
    public void test_eval1() throws IOException {
        HalsteadAnalysator halsteadAnalysator = createHalSteadAnalysator();
        halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/eval1.c");
        halsteadAnalysator.determineParametersAndMetrics();

        Map<String, Integer> expected_operators = new TreeMap<>();
        expected_operators.put("!=", 6);
        expected_operators.put("&", 2);
        expected_operators.put("&&", 4);
        expected_operators.put("'", 18);
        expected_operators.put("(", 31);
        expected_operators.put("*", 16);
        expected_operators.put("+", 13);
        expected_operators.put("++", 1);
        expected_operators.put(",", 12);
        expected_operators.put("-", 5);
        expected_operators.put("/", 3);
        expected_operators.put(":", 4);
        expected_operators.put(";", 33);
        expected_operators.put("=", 10);
        expected_operators.put("==", 3);
        expected_operators.put("case", 4);
        expected_operators.put("else", 3);
        expected_operators.put("for (", 1);
        expected_operators.put("if (", 4);
        expected_operators.put("return", 1);
        expected_operators.put("sizeof", 2);
        expected_operators.put("switch (", 1);
        expected_operators.put("{", 7);



        Map<String, Integer> expected_operands = new TreeMap<>();
        expected_operands.put("%d", 2);
        expected_operands.put("\"Error: Division durch 0 nicht moeglich\"", 1);
        expected_operands.put("\"Error: kein <operator>\"", 1);
        expected_operands.put("\"Error: kein <wert1>\"", 1);
        expected_operands.put("\"Error: kein <wert2>\"", 1);
        expected_operands.put("0", 10);
        expected_operands.put("1", 5);
        expected_operands.put("break", 3);
        expected_operands.put("ch", 12);
        expected_operands.put("char", 7);
        expected_operands.put("eval1", 1);
        expected_operands.put("exit", 4);
        expected_operands.put("extract", 2);
        expected_operands.put("i", 16);
        expected_operands.put("int", 5);
        expected_operands.put("lgval2", 4);
        expected_operands.put("malloc", 2);
        expected_operands.put("operation", 3);
        expected_operands.put("printf", 4);
        expected_operands.put("resultat", 7);
        expected_operands.put("sscanf", 2);
        expected_operands.put("strlen", 3);
        expected_operands.put("val1", 4);
        expected_operands.put("val2", 4);
        expected_operands.put("wert1", 6);
        expected_operands.put("wert2", 7);


        Assert.assertEquals(expected_operators, halsteadAnalysator.operators);
        Assert.assertEquals(expected_operands.size(), halsteadAnalysator.operands.size());

        Assert.assertEquals(184, halsteadAnalysator.N1);
        Assert.assertEquals(117, halsteadAnalysator.N2);
        Assert.assertEquals(23, halsteadAnalysator.n1);
        Assert.assertEquals(26, halsteadAnalysator.n2);
        Assert.assertEquals(301, halsteadAnalysator.N);
        Assert.assertEquals(49, halsteadAnalysator.n);
        Assert.assertEquals(1690, (int) halsteadAnalysator.V);
        Assert.assertEquals(44, (int) halsteadAnalysator.D);
        Assert.assertEquals(74361, (int) halsteadAnalysator.E);
    }

    @Test
    public void test_Beispiel() throws IOException {
        HalsteadAnalysator halsteadAnalysator = createHalSteadAnalysator();
        halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/Beispiel.c");
        halsteadAnalysator.determineParametersAndMetrics();

        Map<String, Integer> expected_operators = new TreeMap<>();
        expected_operators.put("!=", 7);
        expected_operators.put("&", 2);
        expected_operators.put("&&", 4);
        expected_operators.put("'", 20);
        expected_operators.put("(", 37);
        expected_operators.put("*", 27);
        expected_operators.put("+", 14);
        expected_operators.put("++", 4);
        expected_operators.put(",", 20);
        expected_operators.put("-", 5);
        expected_operators.put("/", 5);
        expected_operators.put(":", 4);
        expected_operators.put("<", 1);
        expected_operators.put(";", 46);
        expected_operators.put("=", 15);
        expected_operators.put("==", 3);
        expected_operators.put("[", 1);
        expected_operators.put("case", 4);
        expected_operators.put("else", 4);
        expected_operators.put("for (", 1);
        expected_operators.put("if (", 5);
        expected_operators.put("return", 1);
        expected_operators.put("sizeof", 2);
        expected_operators.put("while (", 1);
        expected_operators.put("switch (", 1);
        expected_operators.put("{", 12);


        Map<String, Integer> expected_operands = new TreeMap<>();
        expected_operands.put("%d", 2);
        expected_operands.put("\"Das Ergebnis der Berechnung ist : %d\"", 1);
        expected_operands.put("\"Error, Nutzung des Programms : eval1 <expression>\"", 1);
        expected_operands.put("\"Error: Division durch 0 nicht moeglich\"", 1);
        expected_operands.put("\"Error: kein <operator>\"", 1);
        expected_operands.put("\"Error: kein <wert1>\"", 1);
        expected_operands.put("\"Error: kein <wert2>\"", 1);
        expected_operands.put("0", 11);
        expected_operands.put("1", 6);
        expected_operands.put("2", 1);
        expected_operands.put("Extrahieren", 1);
        expected_operands.put("Funktion", 1);
        expected_operands.put("Unterzeichenkette", 1);
        expected_operands.put("anfang", 1);
        expected_operands.put("argc", 2);
        expected_operands.put("argv", 2);
        expected_operands.put("break", 3);
        expected_operands.put("ch", 12);
        expected_operands.put("char", 12);
        expected_operands.put("einer", 1);
        expected_operands.put("eval1", 1);
        expected_operands.put("exit", 4);
        expected_operands.put("extract", 4);
        expected_operands.put("i", 20);
        expected_operands.put("in", 1);
        expected_operands.put("int", 13);
        expected_operands.put("lgval2", 4);
        expected_operands.put("main", 1);
        expected_operands.put("malloc", 2);
        expected_operands.put("n", 1);
        expected_operands.put("nb", 3);
        expected_operands.put("operation", 3);
        expected_operands.put("printf", 6);
        expected_operands.put("res", 3);
        expected_operands.put("resultat", 7);
        expected_operands.put("sscanf", 2);
        expected_operands.put("strlen", 3);
        expected_operands.put("val1", 4);
        expected_operands.put("val2", 4);
        expected_operands.put("void", 2);
        expected_operands.put("von", 1);
        expected_operands.put("wert1", 6);
        expected_operands.put("wert2", 6);
        expected_operands.put("zeichenkette1", 7);
        expected_operands.put("zeichenkette2", 6);
        expected_operands.put("zum", 1);



        Assert.assertEquals(expected_operators, halsteadAnalysator.operators);
        Assert.assertEquals(expected_operands.size(), halsteadAnalysator.operands.size());

        Assert.assertEquals(246, halsteadAnalysator.N1);
        Assert.assertEquals(181, halsteadAnalysator.N2);
        Assert.assertEquals(26, halsteadAnalysator.n1);
        Assert.assertEquals(46, halsteadAnalysator.n2);
        Assert.assertEquals(427, halsteadAnalysator.N);
        Assert.assertEquals(72, halsteadAnalysator.n);
        Assert.assertEquals(2634, (int) halsteadAnalysator.V);
        Assert.assertEquals(39, (int) halsteadAnalysator.D);
        Assert.assertEquals(102747, (int) halsteadAnalysator.E);
    }

}
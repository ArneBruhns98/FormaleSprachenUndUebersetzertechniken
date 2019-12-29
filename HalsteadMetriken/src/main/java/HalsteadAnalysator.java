import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HalsteadAnalysator {

    public Map<String, Integer> operators = new TreeMap<>();
    public Map<String, Integer> operands = new TreeMap<>();

    public int N1;     //Anzahl aller Operatoren
    public int N2;     //Anzahl aller Operanden
    public int n1;     //Anzahl verschiedener Operatoren
    public int n2;     //Anzahl verschiedener Operanden

    public int N;      //Programmlänge
    public int n;      //Vokabularlänge

    public double V;   //Volumen des Programms
    public double D;   //Schwierigkeitsgrade ein Programm zu verstehen
    public double E;   //Implementierungsaufwand

    public HalsteadAnalysator(){}

    public void checkHalsteadMetrik(String filename) throws IOException {
        CharStream input = CharStreams.fromFileName(filename);

        HalsteadLexer lexer = new HalsteadLexer(input);
        Token token = lexer.nextToken();
        String token_text;

        while (token.getType() != Token.EOF) {

            token_text = token.getText();

            switch (token.getType()) {

                case 2:
                    if(operators.containsKey(token_text)) operators.put(token_text, operators.get(token_text) + 1);
                    else operators.put(token_text, 1);
                    break;

                case 3:
                    if(operands.containsKey(token_text)) operands.put(token_text, operands.get(token_text) + 1);
                    else operands.put(token_text, 1);
            }

            token = lexer.nextToken();
        }
    }

    public void determineParametersAndMetrics(){
        operators.forEach((k, v) -> {
            N1 += v;
        });

        operands.forEach((k, v) -> {
            N2 += v;
        });

        n1 = operators.keySet().size();
        n2 = operands.keySet().size();

        N = N1 + N2;
        n = n1 + n2;

        V = N * (Math.log(n) / Math.log(2));
        D = (n1 / 2) * (N2 / n2);
        E = V * D;
    }

    public void printResults(){
        STGroup templates = new STGroupFile("./src/main/resources/layout.stg");
        ST st;

        System.out.println(templates.getInstanceOf("operatoren").render());
        st = templates.getInstanceOf("frequencies");
        System.out.println(st.add("map", operators).render());

        System.out.println(templates.getInstanceOf("operanden").render());
        st = templates.getInstanceOf("frequencies");
        System.out.println(st.add("map", operands).render());

        st = templates.getInstanceOf("calculations");
        st.add("N1", N1);
        st.add("N2", N2);
        st.add("n1", n1);
        st.add("n2", n2);
        st.add("N", N);
        st.add("n", n);
        st.add("V", V);
        st.add("D", D);
        st.add("E", E);

        System.out.println(st.render());
    }
}
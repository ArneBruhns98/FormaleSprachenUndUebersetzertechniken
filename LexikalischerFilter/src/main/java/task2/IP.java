package task2;

import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IP {
    public static void main(String[] args) throws Exception {
        checkIPs(Arrays.asList(args));
    }

    public static List<String> checkIPs(List<String> args) throws IOException {
        List<String> ips = new LinkedList<>();
        STGroup templates = new STGroupFile("./src/main/java/task2/layout.stg");

        CharStream input = null;
        String values = "";

        if (args.size() > 0) {
            for(String s : args) values += s;
            input = CharStreams.fromString(values);
        }
        else input = CharStreams.fromStream(System.in);

        IPLexer lex = new IPLexer(input);
        Token t;

        do {
            t = lex.nextToken();
            if(t.getType() == IPLexer.IPADRESS) {
                ST st = templates.getInstanceOf("expression");

                st.add("line", t.getLine());
                st.add("position", t.getCharPositionInLine());
                st.add("text", t.getText());

                ips.add(t.getText());

                System.out.println(st.render());
            }
        } while ( t.getType()!=Token.EOF );

        return ips;
    }
}


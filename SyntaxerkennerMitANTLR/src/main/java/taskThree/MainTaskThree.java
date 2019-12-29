package taskThree;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.Scanner;

public class MainTaskThree {

    private static String parseTree;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression;

        if (args.length > 0) expression = args[0] + "\n";
        else expression = in.nextLine() + "\n";

        int numberOfSyntaxErrors = checkSyntax(expression);

        STGroup templates = new STGroupFile("./src/main/resources/layout.stg");

        ST st = templates.getInstanceOf("syntaxerror");
        st.add("n", numberOfSyntaxErrors);
        System.out.println(st.render());

        if (numberOfSyntaxErrors == 0) {
            st = templates.getInstanceOf("tree");
            st.add("t", parseTree);
            System.out.println(st.render());
        }
    }

    public static int checkSyntax(String expression) {
        CharStream input = CharStreams.fromString(expression);
        TaskThreeLexer lexer = new TaskThreeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TaskThreeParser parser = new TaskThreeParser(tokens);
        ParseTree tree = parser.prog();
        parseTree = tree.toStringTree(parser);
        return parser.getNumberOfSyntaxErrors();
    }

}
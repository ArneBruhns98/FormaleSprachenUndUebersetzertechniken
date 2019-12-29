package TaskGrammarAction;

import gen.grammarGrammarAction.ExprGrammarActionLexer;
import gen.grammarGrammarAction.ExprGrammarActionParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class TaskGrammarAction {

    private int result;

    void calculate(String expression) {
        int numberOfSyntaxErrors = checkSyntax(expression);

        STGroup templates = new STGroupFile("./src/main/resources/layout.stg");
        ST st;

        if(numberOfSyntaxErrors == 0) {
            String[] expr = expression.split("\n");
            int result;

            for(int i = 0; i < expr.length -1; i++) {
                st = templates.getInstanceOf("expression");
                st.add("expression", expr[i].replace("\n", ""));
                System.out.println(st.render());
            }

            result = getResult();
            st = templates.getInstanceOf("calculation");
            st.add("expression", expr[expr.length - 1].replace("\n", ""));
            st.add("result", result);
            System.out.println(st.render());
        } else {
            st = templates.getInstanceOf("syntaxerror");
            st.add("n", numberOfSyntaxErrors);
            System.out.println(st.render());
        }
    }

    public int checkSyntax(String expression) {
        CharStream input = CharStreams.fromString(expression);
        ExprGrammarActionLexer lexer = new ExprGrammarActionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprGrammarActionParser parser = new ExprGrammarActionParser(tokens);
        parser.setBuildParseTree(false);
        result = parser.prog().value;
        return parser.getNumberOfSyntaxErrors();
    }

    public int getResult(){
        return result;
    }

}

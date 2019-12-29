package TaskParseTreeListener;

import gen.grammarVisitorListener.ExprVisitorListenerLexer;
import gen.grammarVisitorListener.ExprVisitorListenerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class TaskParseTreeListener {

    private ParseTreeWalker walker = new ParseTreeWalker();
    private EvaluatorWithProps evalProp = new EvaluatorWithProps();;
    private ParseTree tree;

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
        ExprVisitorListenerLexer lexer = new ExprVisitorListenerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprVisitorListenerParser parser = new ExprVisitorListenerParser(tokens);
        tree = parser.prog();
        return parser.getNumberOfSyntaxErrors();
    }

    public int getResult(){
        walker.walk(evalProp, tree);
        return evalProp.getValue(tree.getChild(tree.getChildCount() - 1));
    }

    public int getResult(int i) {
        if(tree.getText().contains("clear")) return 0;
        walker.walk(evalProp, tree);
        return evalProp.getValue(tree.getChild(i));
    }
}

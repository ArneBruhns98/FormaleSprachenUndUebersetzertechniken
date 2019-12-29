import gen.grammar.cymbol.CymbolLexer;
import gen.grammar.cymbol.CymbolParser;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class CallGraphGreater {

    private ParseTree tree;

    void generateCallGraph(InputStream inputStream) throws IOException {
        int numberOfSyntaxErrors = checkSyntax(inputStream);

        if(numberOfSyntaxErrors == 0) {
            String graph = createCallGraph();
            Graphviz.fromString(graph).width(1300).render(Format.PNG).toFile(new File("./src/main/resources/graph.png"));
            Graphviz.fromString(graph).render(Format.DOT).toFile(new File("./src/main/resources/graph.dot"));
        } else {
            STGroup templates = new STGroupFile("./src/main/resources/syntaxerror.stg");
            ST st = templates.getInstanceOf("syntax_error");
            System.out.println(st.add("n", numberOfSyntaxErrors).render());
        }
    }

    int checkSyntax(InputStream is) throws IOException {
        CharStream input = CharStreams.fromStream(is);
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        tree = parser.file();
        return parser.getNumberOfSyntaxErrors();
    }

    String createCallGraph(){
        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionListener collector = new FunctionListener();
        walker.walk(collector, tree);
        return collector.graph.toST().render();
    }

}
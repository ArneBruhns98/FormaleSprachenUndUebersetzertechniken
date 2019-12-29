import grammar.cymbol.CymbolLexer;
import grammar.cymbol.CymbolParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.*;

class CheckSymbols {

    int exitValue;
    private ParseTree tree;
    private String llvm_code;
    BufferedReader bufferedReader_process_errorStream;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
    }

    void process(InputStream is) throws Exception {
        int numberOfSyntaxErrors = checkSyntax(is);

        if(numberOfSyntaxErrors == 0) {
            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase def = new DefPhase(outContent);
            walker.walk(def, tree);
            Generator generator = new Generator(def.globals, def.scopes);
            walker.walk(generator, tree);
            llvm_code = generator.st.render();
        } else {
            STGroup templates = new STGroupFile("./src/main/resources/templates/syntaxerror.stg");
            ST st = templates.getInstanceOf("syntax_error");
            System.out.println(st.add("n", numberOfSyntaxErrors).render());
        }

        exitValue = executeLLVMCode();
    }

    int checkSyntax(InputStream is) throws IOException {
        CharStream input = CharStreams.fromStream(is);
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        tree = parser.file();
        return parser.getNumberOfSyntaxErrors();
    }

    private int executeLLVMCode() throws IOException, InterruptedException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/resources/generatedCode/LLVM_Code.txt"));
        writer.write(llvm_code);
        writer.close();

        ProcessBuilder pb = new ProcessBuilder("bash", "-c", "lli");
        pb.directory(new File("./src/main/resources"));
        pb.redirectInput(new File("./src/main/resources/generatedCode/LLVM_Code.txt"));
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);

        Process p = pb.start();
        p.waitFor();
        bufferedReader_process_errorStream = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        System.out.println(bufferedReader_process_errorStream.readLine());
        return p.exitValue();
    }

    void createSymTable(InputStream is) throws IOException {
        int numberOfSyntaxErrors = checkSyntax(is);

        if(numberOfSyntaxErrors == 0) {
            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase def = new DefPhase(outContent);
            walker.walk(def, tree);
        } else {
            STGroup templates = new STGroupFile("./src/main/resources/templates/syntaxerror.stg");
            ST st = templates.getInstanceOf("syntax_error");
            System.out.println(st.add("n", numberOfSyntaxErrors).render());
        }
    }
}
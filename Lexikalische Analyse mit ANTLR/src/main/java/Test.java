import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Test {
    public static void main(String[] args) throws Exception {
        //CharStream input = new ANTLRFileStream(args[0]);
        CharStream input = CharStreams.fromString(args[0]);
        SATLexer lex = new SATLexer((org.antlr.v4.runtime.CharStream) input);
        Token t = lex.nextToken();
        while (t.getType() != Token.EOF) {
            int line = t.getLine();
            int pos = t.getCharPositionInLine();
            String text = t.getText();
            switch (t.getType()) {
                case SATLexer.ITYPE:
                    System.out.printf("line %d:%d Found ITYPE: %s\n", line, pos, text);
                    break;
                case SATLexer.ID:
                    System.out.printf("line %d:%d Found ID: %s\n", line, pos, text);
                    break;
                case SATLexer.INT:
                    System.out.printf("line %d:%d Found NUMBER: %s\n", line, pos, text);
                    break;
            }
            t = lex.nextToken();
        }
    }
}
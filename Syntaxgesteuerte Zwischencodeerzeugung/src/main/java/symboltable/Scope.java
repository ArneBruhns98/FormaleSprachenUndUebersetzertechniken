package symboltable;

public interface Scope {

    String getScopeName();

    /** Where to look next for symbols */
    Scope getEnclosingScope();

    /** Define a symbolandscope.symbol in the current symbolandscope.symbol.scope */
    void define(Symbol sym);

    /** Look up name in this symbolandscope.symbol.scope or in enclosing symbolandscope.symbol.scope if not here */
    Symbol resolve(String name);

}

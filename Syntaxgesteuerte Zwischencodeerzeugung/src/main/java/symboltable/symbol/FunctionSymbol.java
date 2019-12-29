package symboltable.symbol;

import symboltable.Scope;
import symboltable.Symbol;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {

	private Map<String, Symbol> orderedArgs = new LinkedHashMap<>();
    private Scope enclosingScope;

    public FunctionSymbol(String name, String retType, Scope enclosingScope) {
        super(name, retType);
        this.enclosingScope = enclosingScope;
    }


	public Symbol resolve(String name) {
		Symbol s = orderedArgs.get(name);
        if ( s!=null ) return s;
		// if not here, check any enclosing symboltable.symbol.scope
		if ( getEnclosingScope() != null ) {
			return getEnclosingScope().resolve(name);
		}
		return null; // not found
	}

	public void define(Symbol sym) {
		orderedArgs.put(sym.name, sym);
		sym.scope = this; // track the symboltable.symbol.scope in each symboltable.symbol
	}

	public Scope getEnclosingScope() { return enclosingScope; }

	public String getScopeName() { return name; }

    public String toString() {
    	return super.toString() + ":" + orderedArgs.values();
    }
}

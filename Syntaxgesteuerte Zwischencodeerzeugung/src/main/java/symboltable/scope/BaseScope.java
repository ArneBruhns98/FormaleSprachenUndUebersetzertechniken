package symboltable.scope;

import symboltable.Scope;
import symboltable.Symbol;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseScope implements Scope {

	private Scope enclosingScope; // null if global (outermost) symboltable.scope
	private Map<String, Symbol> symbols = new LinkedHashMap<>();

    BaseScope(Scope enclosingScope) { this.enclosingScope = enclosingScope;	}

    public Symbol resolve(String name) {
		Symbol s = symbols.get(name);
        if (s != null) return s;
		if (enclosingScope != null) return enclosingScope.resolve(name); // if not here, check any enclosing symboltable.scope
		return null; // not found
	}

	public void define(Symbol sym) {
		symbols.put(sym.name, sym);
		sym.scope = this;
	}

    public Scope getEnclosingScope() {
    	return enclosingScope;
    }

	public String toString() {
    	return symbols.keySet().toString();
    }
}

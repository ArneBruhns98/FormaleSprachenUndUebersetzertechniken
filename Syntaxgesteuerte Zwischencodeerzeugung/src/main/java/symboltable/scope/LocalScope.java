package symboltable.scope;

import symboltable.Scope;

public class LocalScope extends BaseScope {

    public LocalScope(Scope parent) {
        super(parent);
    }

    public String getScopeName() {
        return "local";
    }

}

package symboltable;

public class Symbol {

    public String name;
    private String type;
    public Scope scope;

    private Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, String type) {
        this(name);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if (type != null) return '<' + getName() + ":" + type + '>';
        return getName();
    }

}

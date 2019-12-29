import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.stringtemplate.v4.ST;

import java.util.Set;

class Graph {

    Set<String> tailFunc = new OrderedHashSet<>();
    Set<String> nonTailFunc = new OrderedHashSet<>();
    Set<String> otherFunc = new OrderedHashSet<>();

    private MultiMap<String, String> edges_tail_call = new MultiMap<>();
    private MultiMap<String, String> edges_non_tail_call = new MultiMap<>();
    private MultiMap<String, String> edgesOther = new MultiMap<>();

    void insert_edge_tail_call(String source, String target) {
        edges_tail_call.map(source, target);
    }

    void insert_edge_non_tail_call(String source, String target) {
        edges_non_tail_call.map(source, target);
    }

    void insert_edge_other(String source, String target) {
        edgesOther.map(source, target);
    }

    boolean containsKey_edges_tail_call(String key) {return edges_tail_call.containsKey(key);}

    boolean containsKey_edges_non_tail_call(String key) {return edges_non_tail_call.containsKey(key);}

    ST toST() {
        ST st = new ST(
                "digraph G {\n" +
                        "  ranksep=.25; \n" +
                        "  edge [arrowsize=.5]\n" +
                        "  node [shape=circle, fontname=\"Arial\",\n" +
                        "        fontsize=12, fixedsize=true, height=.45];\n" +
                        "  <tailFunc:{f | <f> [color= \"green\"]; }>\n" +
                        "  <nonTailFunc:{f | <f> [color= \"red\"]; }>\n" +
                        "  <otherFunc:{f | <f> [color= \"black\"]; }>\n" +
                        "  <edgeTCPairs:{edge | <edge.a> -> <edge.b> [color=\"green\"];}; separator=\"\\n\">\n" +
                        "  <edgeNonTCPairs:{edge | <edge.a> -> <edge.b> [color=\"red\"];}; separator=\"\\n\">\n" +
                        "  <edgeOtherPairs:{edge | <edge.a> -> <edge.b> [color=\"black\"];}; separator=\"\\n\">\n" +
                        "}\n"
        );
        st.add("edgeTCPairs", edges_tail_call.getPairs());
        st.add("edgeNonTCPairs", edges_non_tail_call.getPairs());
        st.add("edgeOtherPairs", edgesOther.getPairs());
        st.add("tailFunc", tailFunc);
        st.add("nonTailFunc", nonTailFunc);
        st.add("otherFunc", otherFunc);
        return st;
    }

}

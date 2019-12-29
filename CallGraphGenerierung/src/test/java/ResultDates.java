class ResultDates {

    static final String REC_CYMBOL = "digraph G {\n" +
            "  ranksep=.25; \n" +
            "  edge [arrowsize=.5]\n" +
            "  node [shape=circle, fontname=\"Arial\",\n" +
            "        fontsize=12, fixedsize=true, height=.45];\n" +
            "  add [color= \"green\"]; add2 [color= \"green\"]; ggT [color= \"green\"]; \n" +
            "  sum [color= \"red\"]; sum2 [color= \"red\"]; fact [color= \"red\"]; fib [color= \"red\"]; mcCarthy [color= \"red\"]; ackermann [color= \"red\"]; \n" +
            "  main [color= \"black\"]; identity [color= \"black\"]; binomi [color= \"black\"]; kgV [color= \"black\"]; \n" +
            "  add -> identity [color=\"green\"];\n" +
            "  add -> add [color=\"green\"];\n" +
            "  add2 -> add2 [color=\"green\"];\n" +
            "  add2 -> identity [color=\"green\"];\n" +
            "  sum -> add [color=\"green\"];\n" +
            "  sum2 -> add2 [color=\"green\"];\n" +
            "  ggT -> ggT [color=\"green\"];\n" +
            "  ggT -> ggT [color=\"green\"];\n" +
            "  mcCarthy -> mcCarthy [color=\"green\"];\n" +
            "  ackermann -> ackermann [color=\"green\"];\n" +
            "  ackermann -> ackermann [color=\"green\"];\n" +
            "  sum -> sum [color=\"red\"];\n" +
            "  sum2 -> sum2 [color=\"red\"];\n" +
            "  fact -> fact [color=\"red\"];\n" +
            "  fib -> fib [color=\"red\"];\n" +
            "  fib -> fib [color=\"red\"];\n" +
            "  mcCarthy -> mcCarthy [color=\"red\"];\n" +
            "  ackermann -> ackermann [color=\"red\"];\n" +
            "  main -> sum [color=\"black\"];\n" +
            "  main -> sum2 [color=\"black\"];\n" +
            "  main -> binomi [color=\"black\"];\n" +
            "  main -> fib [color=\"black\"];\n" +
            "  main -> kgV [color=\"black\"];\n" +
            "  main -> ackermann [color=\"black\"];\n" +
            "  main -> mcCarthy [color=\"black\"];\n" +
            "  binomi -> fact [color=\"black\"];\n" +
            "  binomi -> fact [color=\"black\"];\n" +
            "  binomi -> fact [color=\"black\"];\n" +
            "  kgV -> ggT [color=\"black\"];\n" +
            "}\n";

    static final String T_CYMBOL = "digraph G {\n" +
            "  ranksep=.25; \n" +
            "  edge [arrowsize=.5]\n" +
            "  node [shape=circle, fontname=\"Arial\",\n" +
            "        fontsize=12, fixedsize=true, height=.45];\n" +
            "  fact [color= \"red\"]; \n" +
            "  main [color= \"black\"]; a [color= \"black\"]; b [color= \"black\"]; c [color= \"black\"]; d [color= \"black\"]; e [color= \"black\"]; \n" +
            "  fact -> fact [color=\"red\"];\n" +
            "  main -> fact [color=\"black\"];\n" +
            "  main -> a [color=\"black\"];\n" +
            "  fact -> print [color=\"black\"];\n" +
            "  a -> b [color=\"black\"];\n" +
            "  a -> c [color=\"black\"];\n" +
            "  a -> d [color=\"black\"];\n" +
            "  b -> c [color=\"black\"];\n" +
            "  c -> b [color=\"black\"];\n" +
            "}\n";
}
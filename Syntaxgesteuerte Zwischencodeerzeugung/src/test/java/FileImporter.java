class FileImporter {

    static Object[] getFiles_LLVM() {
        return new Object[]{
                new Object[]{"./src/main/resources/CymbolProgs/evenodd.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/fact.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/fib.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/funcCall.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/ifElse.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/ifgt.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/iflt.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/ifTrueFalse.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/max.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/neq.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/not.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/patternS261.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/printf.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/rec.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/sum.cymbol", 0},
                new Object[]{"./src/main/resources/CymbolProgs/uminus.cymbol", 0},
                new Object[]{"./src/main/resources/ClobalProgs/funcCall.clobal",0},
                new Object[]{"./src/main/resources/ClobalProgs/ifElse.clobal", 0},
                new Object[]{"./src/main/resources/ClobalProgs/ifgt.clobal", 0},
                new Object[]{"./src/main/resources/ClobalProgs/iflt.clobal", 0},
                new Object[]{"./src/main/resources/ClobalProgs/ifTrueFalse.clobal", 0},
                new Object[]{"./src/main/resources/ClobalProgs/neq.clobal", 0},
                new Object[]{"./src/main/resources/ClobalProgs/not.clobal", 0},
                new Object[]{"./src/main/resources/ClobalProgs/printf.clobal", 0},
                new Object[]{"./src/main/resources/ClobalProgs/uminus.clobal", 0},
        };
    }

    static Object[] getFiles_SymTable() {
        return new Object[]{
                new Object[]{"./src/main/resources/CymbolProgs/evenodd.cymbol", symTable_evenodd_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/fact.cymbol", symTable_fact_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/fib.cymbol", symTable_fib_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/for.cymbol", symTable_for_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/funcCall.cymbol", symTable_funcCall_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/ifElse.cymbol", symTable_ifElse_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/ifgt.cymbol", symTable_ifgt_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/iflt.cymbol", symTable_iflt_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/ifTrueFalse.cymbol", symTable_ifTrueFalse_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/max.cymbol", symTable_max_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/neq.cymbol", symTable_neq_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/not.cymbol", symTable_not_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/patternS261.cymbol", symTable_patternS261_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/printf.cymbol", symTable_printf_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/rec.cymbol", symTable_rec_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/sum.cymbol", symTable_sum_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/uminus.cymbol", symTable_uminus_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/while.cymbol", symTable_while_cymbol},
                new Object[]{"./src/main/resources/CymbolProgs/whileTwice.cymbol", symTable_whileTwice_cymbol},
                new Object[]{"./src/main/resources/ClobalProgs/for.clobal", symTable_for_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/forTwice.clobal", symTable_forTwice_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/funcCall.clobal",symTable_funcCall_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/ifElse.clobal", symTable_ifElse_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/ifgt.clobal", symTable_ifgt_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/iflt.clobal", symTable_iflt_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/ifTrueFalse.clobal", symTable_ifTrueElse_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/neq.clobal", symTable_neq_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/not.clobal", symTable_not_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/printf.clobal", symTable_printf_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/uminus.clobal", symTable_uminus_clobal},
                new Object[]{"./src/main/resources/ClobalProgs/while.clobal", symTable_while_clobal},
        };
    }

    private static String symTable_evenodd_cymbol =
                "locals: []\n" +
                "function <even:int>:[<n:int>]\n" +
                "\n" +
                "locals: []\n" +
                "function <odd:int>:[<n:int>]\n" +
                "\n" +
                "locals: []\n" +
                "function <main:int>:[]\n" +
                "\n" +
                "globals: [even, odd, main]\n";

    private static String symTable_fact_cymbol =
                    "locals: []\n" +
                    "function <fact:int>:[<n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [fact, main]\n";

    private static String symTable_fib_cymbol =
                    "locals: []\n" +
                    "function <fib:int>:[<n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [fib, main]\n";

    private static String symTable_for_cymbol =
                    "locals: []\n" +
                    "locals: [n, i]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [main]\n";

    private static String symTable_funcCall_cymbol =
                    "locals: []\n" +
                    "function <f:int>:[<a:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [f, main]\n";

    private static String symTable_ifElse_cymbol =
                    "locals: [i, j]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, main]\n";


    private static String symTable_ifgt_cymbol =
                    "locals: [n, i]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [main]\n";


    private static String symTable_iflt_cymbol =
                    "locals: [n, i]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [main]\n";

    private static String symTable_ifTrueFalse_cymbol =
                    "locals: []\n" +
                    "locals: [n, i]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [main]\n";

    private static String symTable_max_cymbol =
                    "locals: []\n" +
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <max:int>:[<a:int>, <b:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [max, main]\n";

    private static String symTable_neq_cymbol =
                    "locals: [n, i]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [main]\n";

    private static String symTable_not_cymbol =
                    "locals: [n, i]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [main]\n";

    private static String symTable_patternS261_cymbol =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "locals: [z]\n" +
                    "function <f:int>:[<x:int>, <y:int>]\n" +
                    "\n" +
                    "globals: [main, f]\n";

    private static String symTable_printf_cymbol =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, main]\n";

    private static String symTable_rec_cymbol =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <fact:int>:[<n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <ggT:int>:[<m:int>, <n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <fib:int>:[<n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <mcCarthy:int>:[<n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <ackermann:int>:[<n:int>, <m:int>]\n" +
                    "\n" +
                    "globals: [main, fact, ggT, fib, mcCarthy, ackermann]\n";

    private static String symTable_sum_cymbol =
            "locals: []\n" +
                    "function <identity:int>:[<x:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <add:int>:[<x:int>, <y:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <add2:int>:[<x:int>, <y:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <sum:int>:[<n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <sum2:int>:[<n:int>]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [identity, add, add2, sum, sum2, main]\n";

    private static String symTable_uminus_cymbol =
                    "locals: [a, b]\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [main]\n";

    private static String symTable_while_cymbol =
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_whileTwice_cymbol =
                    "locals: []\n" +
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_for_clobal =
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_forTwice_clobal =
                    "locals: []\n" +
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_funcCall_clobal =
                    "locals: []\n" +
                    "function <f:int>:[]\n" +
                    "\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [f, main]\n";

    private static String symTable_ifElse_clobal =
                    "locals: []\n" +
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_ifgt_clobal =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_iflt_clobal =
                     "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_ifTrueElse_clobal =
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_neq_clobal =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_not_clobal =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

    private static String symTable_printf_clobal =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [a, b, c, d, z, main]\n";

    private static String symTable_uminus_clobal =
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [a, b, main]\n";

    private static String symTable_while_clobal =
                    "locals: []\n" +
                    "locals: []\n" +
                    "function <main:int>:[]\n" +
                    "\n" +
                    "globals: [n, i, main]\n";

}

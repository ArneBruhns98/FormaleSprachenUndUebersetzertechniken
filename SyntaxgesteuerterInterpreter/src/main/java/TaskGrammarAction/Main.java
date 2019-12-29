package TaskGrammarAction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression;

        if (args.length > 0) expression = args[0] + "\n";
        else expression = in.nextLine() + "\n";

        TaskGrammarAction taskGrammarAction = new TaskGrammarAction();
        taskGrammarAction.calculate(expression);
    }
}

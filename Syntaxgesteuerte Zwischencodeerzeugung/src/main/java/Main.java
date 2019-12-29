import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream;
        Scanner in = new Scanner(System.in);

        if (args.length == 1) inputStream = new FileInputStream(args[0]);
        else inputStream = new FileInputStream(in.nextLine());

        CheckSymbols checkSymbols = new CheckSymbols();
        checkSymbols.process(inputStream);
    }

}

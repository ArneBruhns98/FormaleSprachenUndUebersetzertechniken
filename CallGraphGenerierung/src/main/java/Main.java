import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream;
        Scanner in = new Scanner(System.in);

        if(args.length == 1) inputStream = new FileInputStream(args[0]);
        else inputStream = new FileInputStream(in.nextLine());

        CallGraphGreater callGraphGreater = new CallGraphGreater();
        callGraphGreater.generateCallGraph(inputStream);
    }

}

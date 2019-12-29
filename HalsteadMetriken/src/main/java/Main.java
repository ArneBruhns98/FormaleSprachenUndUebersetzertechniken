import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HalsteadAnalysator halsteadAnalysator = new HalsteadAnalysator();

        try{
            switch(args.length){
                case 0:
                    System.out.print("Please enter the file name here (the file must be located in the folder resources in this project): ");
                    halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/" + scanner.nextLine());
                    break;
                case 1:
                    halsteadAnalysator.checkHalsteadMetrik("./src/main/resources/" + args[0]);
                    break;
                case 2:
                    System.out.println("Only one file is allowed");
            }
        } catch (Exception e){
            System.out.println("Something went wrong. Check your input.");
        }


        halsteadAnalysator.determineParametersAndMetrics();
        halsteadAnalysator.printResults();
    }
}

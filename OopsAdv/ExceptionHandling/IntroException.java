package ExceptionHandling;
import java.util.Scanner;

public class IntroException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter denominator: ");
        int i = scanner.nextInt();
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){     // What is we enter denominator 0
            System.out.println("Something went wrong....");
        }

        System.out.println("Answer is: "+j);
        System.out.println("Bye");


        scanner.close();
    }
}
package ExceptionHandling;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print("Enter denominator: ");
        i = scanner.nextInt();
        int j = 0;

        try{
            j = 18/i;
            if(j==0){   // Its only if i is greater than 18
                throw new ArithmeticException("I don't want to print 0");
            }
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("This is default output "+ e);
        }
        System.out.println("Answer: "+j);
        scanner.close();
    }
}

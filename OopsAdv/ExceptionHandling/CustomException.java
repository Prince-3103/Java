package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Exception is a user-defined exception class created by extending Exception.
// It is used to handle application-specific errors.

class ThalaException extends Exception{
    public ThalaException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        
        try{
            System.out.print("Enter a number: ");
            i = scanner.nextInt();
            if(i==7){
                throw new ThalaException("This is for Thala");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Please enter integer value");
        }
        catch(ThalaException e){
            System.out.println("Thala for a reason "+e);
        }

        scanner.close();
    }
}

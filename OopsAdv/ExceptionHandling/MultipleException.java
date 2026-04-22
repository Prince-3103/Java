package ExceptionHandling;
import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        try{
            for(int i = 0; i<arr.length; i++){
                System.out.printf("Enter value of array[%d]: ",i);
                arr[i] = scanner.nextInt();
            }

            int find;
            System.out.print("What value do you want from array: ");
            find = scanner.nextInt();
            
            System.out.printf("Value of array[%d]: %d",find,arr[find]);
        }
        catch(InputMismatchException e){    // What if user enter float value or other symbol
            System.out.println("Please enter only Integer value!!");
        }
        catch(ArrayIndexOutOfBoundsException e){    // What is user want value greater than 5
            System.out.println("Please stay in your array limit!!");
        }
        catch(Exception e){     // Catches any exception
            System.out.println("Something went wrong!!");
        }

        System.out.println();
        for(int i : arr){
            System.out.print(i+ " ");
        }


        scanner.close();
    }
}

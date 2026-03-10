import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter number: ");
        num = scanner.nextInt();
        long ans = fact(num);

        System.out.println("Factorial of "+num+" is "+ans);

        scanner.close();

    }

    public static long fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num-1);
    }
}

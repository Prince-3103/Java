import java.util.Scanner;

public class factorialMethod {
    static long fact(int n){
        if(n == 0){
            return 1;
        }
        long i = 1;
        while(n>0){
            i = i * n;
            n--;
        }
        return i;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter number to find factorial: ");
        num = scanner.nextInt();

        long ans = fact(num);
        System.out.printf("\nFactorial of %d is %d\n",num,ans);

        scanner.close();
    }
}

import java.util.Scanner;

public class compundIntrest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int principal, time, n;
        double  rate;
        double compoundIntrest;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextInt();

        System.out.print("Enter the interest rate(in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of time compounded per year: ");
        n = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        time = scanner.nextInt();

        compoundIntrest = principal * Math.pow((1+(rate/n)),(n*time));

        System.out.printf("\nThe amount after %d years is $%.2f", time, compoundIntrest);

        scanner.close();
    }
}

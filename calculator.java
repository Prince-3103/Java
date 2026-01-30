import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        double result = 0;
        char op;
        int validOperation = 1;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+,-,*,/,^): ");
        op = scanner.next().charAt(0);    // It will only take one output

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(op){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divideby zero");
                    validOperation = 0;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default  -> {
                System.out.println("Invalid operation");
                validOperation = 0;
            }
        }

        if(validOperation == 1){
            System.out.printf("\n %.1f %c %.1f = %.1f", num1, op, num2, result);
        }

        scanner.close();
    }
}

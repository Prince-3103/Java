import java.util.Scanner;

public class shopingCart {
    public static void main(String[] args){
        String food;
        double prize;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        food = input.nextLine();

        System.out.print("What is the price for each?(in $): ");
        prize = input.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = input.nextInt();

        prize = prize * quantity;

        System.out.println("You have bought "+ quantity +" "+ food +"/s");
        System.out.println("Your total is $"+ prize);

        input.close();
    }
}

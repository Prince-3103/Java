import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        // Display Welcome msg
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println(" Symbols: 🎲 🍒 🍉 🍋 🏆 ");
        System.out.println("*************************");

        while(balance > 0){
            System.out.println("Current Balance: $"+ balance);
            System.out.print("Enter the bet: ");
            bet = scanner.nextInt();

            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                // continue;
            }
            else if(bet < 0){
                System.out.println("Bet must be greater than 0");
                // continue;
            }
            else{
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

        }

        
        scanner.close();    
    }

    static String[] spinRow(){

        String[] symbols = {"🎲", "🍒", "🍉", "🍋", "🏆"};
        String[] row = new String[3];
        
        Random random = new Random();
        for(int i = 0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
}

import java.util.Scanner;

public class inputArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of food you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i=0; i<foods.length; i++){
            System.out.print("Enter the food: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("Your food list: ");
        for(String food : foods){
            System.out.print(food +" ");
        }
        scanner.close();
    }
}

import java.util.Scanner;;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // // Small issue we cant take input first integer then string it will create buffer cause integer take input in 25\n so \n get enter in next string input 
        // System.out.print("Enter number: ");
        // int temp = input.nextInt();
        // // To stop this isssue we make a new nextLine input 
        // input.nextLine();
        

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = input.nextDouble();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age +" year old.");
        System.out.println("Your gpa is "+gpa);

        input.close();
        
    }
}
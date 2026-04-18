package OopsAdv.Enum;
import java.util.Scanner;

// Enum -> (Enumerations) is a special kind of class that represents a fixed set of     
//         constants.
//         They improved code readability and are easy to maintain.@interface
//         More efficient with switches when comparing strings.

enum Day{
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;
    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return dayNumber;
    }

}

public class intro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY -> System.out.println("Today is Weekday");
                case SATURDAY,
                    SUNDAY -> System.out.println("Today is weekend so holiday");
            }
        }
        catch(IllegalArgumentException a){
            System.out.println("Please enter a valid day");
        }
        

        scanner.close();
    }
}

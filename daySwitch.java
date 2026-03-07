import java.util.Scanner;

public class daySwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        String day = scanner.nextLine().toLowerCase();

        // switch(day) {
        //     case "monday":
        //         System.out.println("Today is Monday (working day).");
        //         break;
        //     case "tuesday":
        //         System.out.println("Today is Tuesday (working day)");
        //         break;
        //     case "wednesday":
        //         System.out.println("Today is Wednesday (working day)");
        //         break;
        //     case "thursday":
        //         System.out.println("Today is Thursday (working day)");
        //         break;
        //     case "friday":
        //         System.out.println("Today is Friday (working day)");
        //         break;
        //     case "saturday":
        //         System.out.println("Today is Saturday (Weekend)");
        //         break;
        //     case "sunday":
        //         System.out.println("Today is Sunday (Weekend)");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        //         break;
        //}

        String daystr = switch(day){
            case "monday" -> "Today is weekday";
            case "tuesday" -> "Today is weekday";
            case "wednesday" -> "Today is weekday";
            case "thusday" -> "Today is weekday";
            case "friday" -> "Today is weekday";
            case "saturday", "sunday" -> "Today is weekend";
            default -> "Invalid day";
        };
        System.out.print(daystr);
        scanner.close();
    }    
}

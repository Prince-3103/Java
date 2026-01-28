import java.util.Scanner;

public class cicumference {
    public static void main(){

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circum, area;

        System.out.print("Enter the radius of circle(in cm): ");
        radius = scanner.nextDouble();

        circum = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        // printf() is a method toformat output
        // %.1f only take one decimal value
        System.out.printf("\nCicumference of circle is %.1fcm", circum);
        System.out.printf("\nArea of circle is %.1fcm²", area);
        scanner.close();
    }
}

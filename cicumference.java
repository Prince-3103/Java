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

        System.out.println("Cicumference of circle is "+ circum +"cm");
        System.out.println("Area of circle is "+ area +"cm²");
        scanner.close();
    }
}

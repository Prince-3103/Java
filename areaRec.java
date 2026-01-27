import java.util.Scanner;

public class areaRec {
    public static void main(String[] args){
        double length, width, area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        area = length * width;

        System.out.println("Area of Rectangle: "+area+"cm^2");

        scanner.close();
    }
}

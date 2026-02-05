class Car {
    String make = "Ford";
    String model = "Mustange";
    int year = 2025;
    double price = 59000.99;
    boolean isRunning = false;    
}

public class carCheck {
    public static void main(String[] args){
        Car car = new Car();

        System.out.println("Car maker-> "+ car.make);
        System.out.println("Car model-> "+ car.model);
        System.out.println("Car price-> $"+ car.price);
        System.out.println("Model year-> "+ car.year);
    } 
}

package OopsAdv.Interface;

interface Car
{
    // All Variables in interface are already final and static so we have to gave value
    int wheel = 4;
    int TotalFuel = 30;

    void drive();
    void music();
}

class Wagonr implements Car
{
    public void drive(){
        System.out.println("Wagonr is Driving");
    }
    public void music(){
        System.out.println("Music is playing");
    }
}

public class Interface1 {
    public static void main(String[] args){
        Car car1 = new Wagonr();

        car1.drive();
        car1.music();

        System.out.println("Total fuel in Car is " + Car.TotalFuel);
        System.out.println("Number of wheel in car is " + Car.wheel);
    }
}

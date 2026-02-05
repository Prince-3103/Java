class Calculator{
    int a;
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}

public class sum {
    public static void main(String args[]){
        int a = 23;
        int b = 27;
        Calculator calc = new Calculator();
        int result = calc.add(a, b);
        System.out.println("Sum is "+result);
    }
}

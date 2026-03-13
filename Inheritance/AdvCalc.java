package Inheritance;

public class AdvCalc extends Calc{      // extends for inheritance takes all property from parent calc
    public int product(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public AdvCalc(){
        System.out.println("Run");
    }
}

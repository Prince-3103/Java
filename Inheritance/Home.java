package Inheritance;

// To use this program open terminal and run from java folder not from Inheritance folder
// Use cmd
// javac Inheritance/*.java
// java Inheritance.Home

public class Home {
    public static void main(String[] args){
        AdvCalc prob = new AdvCalc();
        int a = prob.product(3,7);
        System.out.println(a);
    }
}

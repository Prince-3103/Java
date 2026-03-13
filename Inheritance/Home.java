package Inheritance;  // This is only for folder which is given by Vs code

// To use this program open terminal and run from java folder not from Inheritance folder
// Use cmd
// javac Inheritance/*.java
// java Inheritance.Home

public class Home {
    public static void main(String[] args){
        AdvCalc prob = new AdvCalc();
        int a = prob.product(3,7);
        int b = prob.add(4, 5);
        int c = prob.sub(5, 2);
        int d = prob.divide(18, 3);
        System.out.println(a +" "+ b +" "+ c +" "+d);
    }
}

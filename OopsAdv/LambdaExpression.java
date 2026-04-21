// Functional Interface -> It is an interface that has only one abstract method. It is    
//                         mainly used in Lambda Expressions to write shorter and cleaner 
//                         code.

// Lambda Expression -> A Lambda Expression is a short way to write a function (method) 
//                      without a name.

@FunctionalInterface
interface Math{
    int sum(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args){

        // Anonymous Class
        // Math ans = new Math(){
        //     public int sum(int a, int b){
        //          return a+b;
        //     }
        // };
        // System.out.println("Sum is: "+ ans.sum(4,3));

        // Lambda Expression
        Math ans = (a,b) ->{
            return a+b;
        };
        System.out.println("Sum is "+ans.sum(5, 3));

        // More Shorter
        Math ans1 = (a,b) -> a+b;
        System.out.println("Sum is "+ ans1.sum(2, 9));
    }
}

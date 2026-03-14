package Inheritance.animal;

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animals drink milk");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog bark");
    }
}

class Puppy extends Dog{
    void small(){
        System.out.println("Puppy small and very cute");
    }
}

public class check {
    public static void main(String[] args) {
        Puppy hound = new Puppy();
        hound.eat();
        hound.drink();
        hound.bark();
        hound.small();   
    }
}
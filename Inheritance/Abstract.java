package Inheritance;

abstract class DataBase{
    abstract public void store();
    abstract void greet();
}

class Student extends DataBase{
    public void store(){
        System.out.println("Data in SQL");
    }
    void greet(){
        System.out.println("Hello Student");
    }
}

class Teacher extends DataBase{
    public void store(){
        System.out.println("Data in Excel");
    }
    void greet(){
        System.out.println("Hello Teacher");
    }
}

class Admin extends DataBase{
    public void store(){
        System.out.println("Data in Oracle");
    }
    void greet(){
        System.out.println("Hello Admin");
    }
}


public class Abstract {
    public static void main(String[] args) {
        DataBase db = new Student();
        // 👉 Reference type = DataBase
        // 👉 Object type = Student
        db.greet();
        db.store();

        db = new Teacher();
        db.greet();
        db.store();

        db = new Admin();
        db.greet();
        db.store();

    }
}

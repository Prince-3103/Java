package CollectionFramework;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age=" + age + ", name=" + name +"]";
    }

    // Comparable -> defines default sorting (inside class)
    public int compareTo(Student next){
        if(this.age>next.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class ComparableClass {
    public static void main(String[] args)
    {
        ArrayList<Student> studs = new ArrayList<>();

        // Comparator<Student> comp = (i,j) ->{
        //     if(i.age>j.age)
        //         return 1;
        //     else   
        //         return -1;
        // };

        studs.add(new Student(22, "Sunil"));
        studs.add(new Student(20, "Prince"));
        studs.add(new Student(28, "Abd"));
        studs.add(new Student(15, "Vaibhav"));
        studs.add(new Student(18, "Ayush"));

        Collections.sort(studs);

        for(Student s: studs){
            System.out.println(s);
        }

    }
}

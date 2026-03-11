class Human{
    String name;
    private int age;
    private String address;
    // Accessing the private data
    public void setAge(int n){
        age = n;
    }
    public void setAddress(String ad){
        address = ad;
    }

    // Printing method of private data
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

}

public class encapsulation {
    public static void main(String[] args){
        Human h1 = new Human();

        h1.name = "Prince";
        // h1.age = 19;    // Can't access private data 
        // h1.address = "Winterfell";     // Same with it

        h1.setAge(19);
        h1.setAddress("Winterfell");

        System.out.println(h1.name);
        System.out.println(h1.getAge());
        System.out.println(h1.getAddress());

    }
}

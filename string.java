public class string {
    public static void main(String[] args){
        String name = "Jon";
        System.out.println(name);

        name = name + " Snow"; // After concat the Jon value is going in garbage collection
        System.out.println(name);

        String n2 = "jon";
        String n3 = "jon";
        System.out.println(n2 == n3);   // Sharing same address(refrence) means both pointing at one value jon
        
    }
}

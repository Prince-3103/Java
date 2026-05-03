package CollectionFramework;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(83);
        nums.add(1);
        nums.add(7);
        nums.add(69);
        System.out.println(nums);

        for(int n : nums){
            System.out.println(n);
        }
    }
}
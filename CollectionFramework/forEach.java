package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach { 
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(7);
        nums.add(2);
        nums.add(9);
        nums.add(3);

        nums.forEach(n -> System.out.println(n*2));

    }
}

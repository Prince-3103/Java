package CollectionFramework;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args){

        // Collection -> parent interface (stores group of objects)
        // HashSet -> stores UNIQUE elements (no duplicates)
        // Order -> NOT maintained (random order)
        // Set -> no indexing (cannot use index like arr[0])

        Collection<Integer> nums = new HashSet<Integer>();

        nums.add(49);
        nums.add(21);
        nums.add(28);
        nums.add(69);
        nums.add(7);
        // nums.add(21); // duplicate -> ignored

        // Iterator -> used to traverse collection (no index access)
        Iterator<Integer> iter = nums.iterator();

        // hasNext() -> checks if next element exists
        // next() -> returns next element

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // for(int i : nums){
        //     System.out.println(i);
        // }

    }
}

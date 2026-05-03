package CollectionFramework;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args){

        // Collection -> parent interface (stores group of objects)
        // TreeSet -> stores unique + sorted elements (ascending order)
        // duplicates not allowed (TreeSet ignores duplicates)
        // Set dont have any indexing

        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(43);
        nums.add(21);
        nums.add(68);
        nums.add(11);
        nums.add(3);

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

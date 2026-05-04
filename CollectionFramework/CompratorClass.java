package CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompratorClass {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(28);
        arr.add(74);
        arr.add(61);
        arr.add(33);
        arr.add(16);
        arr.add(74);

        // Comparator -> used to define custom sorting logic
        Comparator<Integer> comp = new Comparator<>(){

            // compare(i, j)
            // return >0 → swap
            // return <0 → no swap
            // return 0 → equal
            public int compare(Integer i, Integer j){
                // sorting based on last digit
                if(i%10>j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        // Collections.sort(arr);

        // Collections.sort() -> sorts list
        Collections.sort(arr, comp);   // custom sorting
        
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
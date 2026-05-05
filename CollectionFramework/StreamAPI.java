package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
         // List -> collection of elements
        List<Integer> nums = Arrays.asList(3,4,5,6,4,9,8);
        
        // stream() -> converts collection into stream. It can be used only once
        Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.print(n + " ")); // We have to comment this for work further

        // filter() -> selects elements (condition)
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // s2.forEach(n -> System.out.print(n + " "));

        // map() -> transforms elements
        Stream<Integer> s3 = s2.map(n -> n*2);
        
        // forEach() -> terminal operation (prints values)
        s3.forEach(n -> System.out.print(n + " "));
    }
}

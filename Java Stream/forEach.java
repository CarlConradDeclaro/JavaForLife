
// Java code for Stream of(T... values)
// to get a sequential ordered stream whose
// elements are the specified values.
  
import java.util.*;
import java.util.stream.Stream;
  
class Main {
  
    // Driver code
    public static void main(String[] args)
    {
       List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
  
        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    
    }
}


// Java code for IntStream skip() function
import java.util.*;
import java.util.stream.IntStream;
  
class Main {
  
    // Driver code
    public static void main(String[] args)
    {
        // Creating an IntStream of numbers [5, 6, .. 11]
        IntStream stream = IntStream.range(5, 12);
  
        // Using skip() to skip first 4 values in range
        // and displaying the rest of elements
        stream.skip(4).forEach(System.out::println);
        
        
        // IntStream stream = IntStream.range(5, 12);
  
        // // Using parallel skip() to skip first 4 values in range
        // // and displaying the rest of elements
        // stream.parallel().skip(4).forEach(System.out::println);
    }
}
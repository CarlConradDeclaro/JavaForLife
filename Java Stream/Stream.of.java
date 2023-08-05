
// Java code for Stream of(T... values)
// to get a sequential ordered stream whose
// elements are the specified values.
  
import java.util.*;
import java.util.stream.Stream;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
        // Creating an Stream
        Stream stream = Stream.of("Geeks", "for", "Geeks");
  
        // Displaying the sequential ordered stream
        stream.forEach(System.out::println);
    }
}

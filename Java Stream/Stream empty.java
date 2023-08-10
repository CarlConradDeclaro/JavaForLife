
// Java code for Stream empty()
import java.util.*;
import java.util.stream.Stream;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
        // Creating an empty Stream
        Stream<String> stream = Stream.empty();
  
        // Displaying elements in Stream
        stream.forEach(System.out::println);
    }
}
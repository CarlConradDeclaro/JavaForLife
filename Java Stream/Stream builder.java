
// Java code for Stream builder()
import java.util.*;
import java.util.stream.Stream;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
        // Using Stream builder()
        Stream.Builder<String> builder = Stream.builder();
  
        // Adding elements in the stream of Strings
        Stream<String> stream = builder.add("Geeks")
                                    .add("for")
                                    .add("Geeks")
                                    .add("GeeksQuiz")
                                    .build();
  
        // Displaying the elements in the stream
        stream.forEach(System.out::println);
    }
}
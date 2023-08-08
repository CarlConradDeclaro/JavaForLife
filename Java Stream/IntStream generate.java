
// Java code for IntStream.generate()
// to generate an infinite sequential
// unordered IntStream
import java.util.*;
import java.util.stream.IntStream;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // using IntStream.generate() method
        // to generate 7 random Integer values
        IntStream stream = IntStream.generate(()
                          -> { return (int)(Math.random() * 10000); });
  
        // Displaying the randomly generated values
        stream.limit(7).forEach(System.out::println);
    }
}
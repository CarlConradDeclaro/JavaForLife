// Java code for IntStream iterator()
import java.util.*;
import java.util.stream.IntStream;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
        // Creating an IntStream
        IntStream stream = IntStream.of(2, 4, 6, 8);
  
        // Using IntStream iterator() to return
        // an iterator for elements of the stream
        PrimitiveIterator.OfInt answer = stream.iterator();
  
        // Displaying the stream elements
        while (answer.hasNext()) {
            System.out.println(answer.nextInt());
        }
        
        
        
        // Creating an IntStream which includes
        // lower bound element but excludes
        // upper bound element
        // IntStream stream = IntStream.range(2, 8);
  
        // // Using IntStream iterator() to return
        // // an iterator for elements of the stream
        // PrimitiveIterator.OfInt answer = stream.iterator();
  
        // // Displaying the stream elements
        // while (answer.hasNext()) {
        //     System.out.println(answer.nextInt());
        // }
    }
}

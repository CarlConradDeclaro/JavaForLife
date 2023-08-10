
// Java code for Stream toArray()
import java.util.*;
import java.util.stream.Stream;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
        // Creating a Stream of Integers
        Stream<Integer> stream = Stream.of(5, 6, 7, 8, 9, 10);
  
        // Using Stream toArray()
        Object[] arr = stream.toArray();
  
        // Displaying the elements in array arr
        System.out.println(Arrays.toString(arr));
        
        
        
        
        
        
        //  Stream<String> stream = Stream.of("Geeks", "for",
        //                                   "gfg", "GeeksQuiz");
  
        // // Using Stream toArray() and filtering
        // // the elements that starts with 'G'
        // Object[] arr = stream.filter(str
        //                              -> str.startsWith("G"))
        //                   .toArray();
  
        // // Displaying the elements in array arr
        // System.out.println(Arrays.toString(arr));
    }
}

// Java code for Stream mapToInt
// (ToIntFunction mapper) to get a
// IntStream by applying the given function
// to the elements of this stream.
import java.util.*;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a list of Strings
        List<String> list = Arrays.asList("Geeks", "for", "gfg",
                                          "GeeksforGeeks", "GeeksQuiz");
  
        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        // which contains length of each element in
        // given Stream
        list.stream().mapToInt(str -> str.length()).forEach(System.out::println);
        
        
        
        //  List<String> list = Arrays.asList("3", "6", "8", 
        //                                     "14", "15");
  
        // // Using Stream mapToInt(ToIntFunction mapper)
        // // and displaying the corresponding IntStream
        // list.stream().mapToInt(num -> Integer.parseInt(num))
        //              .filter(num -> num % 3 == 0)
        //              .forEach(System.out::println);
    }
}

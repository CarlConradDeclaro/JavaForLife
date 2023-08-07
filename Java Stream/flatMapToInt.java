
// Java code for Stream flatMapToInt
// (Function mapper) to get an IntStream
// consisting of the results of replacing
// each element of this stream with the
// contents of a mapped stream.
import java.util.*;
import java.util.stream.IntStream;
  
class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a list of Strings
        List<String> list = Arrays.asList("1", "2", "3",
                                          "4", "5");
  
        // Using Stream flatMapToInt(Function mapper)
        list.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))).
        forEach(System.out::println);
        
        // list.stream().flatMapToInt(str -> IntStream.of(str.length())).
        // forEach(System.out::println);
    }
}

// Java code for forEachOrdered
// (Consumer action) in Java 8
import java.util.*;
  
class Main {
      
    // Driver code
    public static void main(String[] args) {
  
    // Creating a list of Strings
    List<String> list = Arrays.asList("GFG", "Geeks", 
                             "for", "GeeksforGeeks");
      
    // Using forEachOrdered(Consumer action) to 
    // print the elements of stream in encounter order
    list.stream().forEachOrdered(System.out::println);
      
  
}
}

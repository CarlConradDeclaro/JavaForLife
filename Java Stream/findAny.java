
// Java code for Stream findAny()
// which returns an Optional describing
// some element of the stream, or an
// empty Optional if the stream is empty.
import java.util.*;
  
class Main {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "for",
                                          "GeeksQuiz", "GFG");
  
        // Using Stream findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<String> answer = list.stream().findAny();
  
        // if the stream is empty, an empty
        // Optional is returned.
        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
            System.out.println("no value");
        }
    }
}

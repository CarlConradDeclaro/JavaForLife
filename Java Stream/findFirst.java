
// Java code for Stream findFirst()
// which returns an Optional describing
// the first element of this stream, or
// an empty Optional if the stream is empty.
import java.util.*;
  
class Main {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("GeeksforGeeks", "for",
                                          "GeeksQuiz", "GFG");
  
        // Using Stream findFirst()
        Optional<String> answer = list.stream().findFirst();
  
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


// Java code to count number of elements 
// in stream
import java.util.stream.Stream;
import java.util.stream.Collectors;
class counting {
    public static void main(String[] args)
    {
        // creating stream of integers
        Stream<Integer> i = Stream.of(1, 2, 3, 4, 5, 6);
  
        // counting number of integer in stream
        long count_int = i.collect(Collectors.counting());
  
        System.out.println(count_int);
    }
}

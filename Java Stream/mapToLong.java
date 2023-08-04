/*
Stream mapToLong(ToLongFunction mapper) returns a LongStream consisting of the results of 
applying the given function to the elements of this stream.
Stream mapToLong(ToLongFunction mapper) is an intermediate operation. 
These operations are always lazy. Intermediate operations are invoked on a Stream 
instance and after they finish their processing, they give a Stream instance as output.
*/
import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
	 List<String> list = Arrays.asList("25", "225", "1000", "20", "15");
  
        // Using Stream mapToLong(ToLongFunction mapper)
        // and displaying the corresponding LongStream
        list.stream().mapToLong(num -> Long.parseLong(num))
            .filter(num -> Math.sqrt(num) / 5 == 3 )
            .forEach(System.out::println);
	}
}

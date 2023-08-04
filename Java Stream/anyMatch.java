/*Stream anyMatch(Predicate predicate) returns whether any elements of
this stream match the provided predicate. It may not evaluate the
predicate on all elements if not necessary for determining the result.
This is a short-circuiting terminal operation. A terminal operation is 
short-circuiting if, when presented with infinite input, it may terminate
in finite time.
*/
import java.util.stream.Stream;
 
public class Main
{
	public static void main(String[] args) {
	 
	 Stream<String> list = Stream.of("hello","World");
	 
	 
	 boolean isUpper = list.anyMatch(n -> Character.isUpperCase(n.charAt(0)));
	 
	 
	 System.out.println(isUpper);
	}
}

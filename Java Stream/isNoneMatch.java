/*A stream is a sequence of objects that supports various methods
which can be pipelined to produce the desired result. noneMatch()
of Stream class returns whether no elements of this stream match
the provided predicate.
*/
import java.util.stream.Stream;

public class Main
{
  public static void main (String[]args)
  {

    Stream < String > list =
      Stream.of ("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks", "CSe");


    boolean isNoneMatch =
      list.noneMatch (n->Character.isUpperCase (n.charAt (1))
		      && Character.isLowerCase (n.charAt (2))
		      && n.charAt (0) == 'f');


      System.out.println (isNoneMatch);
  }
}

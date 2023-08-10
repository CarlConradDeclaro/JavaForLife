
// Java code for IntStream summaryStatistics()
// to get various summary data about the
// elements of the stream.
import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;
  
class Main {
  
    // Driver code
    public static void main(String[] args)
    {
        
         // Creating an IntStream
        IntStream stream = IntStream.of(4, 5, 6, 7);
  
        // Using IntStream summaryStatistics()
        IntSummaryStatistics summary_data = 
                        stream.summaryStatistics();
  
        // Displaying the various summary data
        // about the elements of the stream
        System.out.println(summary_data);
        
        
        
        // Creating an IntStream of elements
        // in range [5, 9)
      //  IntStream stream = IntStream.range(5, 9);
  
        // Using IntStream summaryStatistics()
       // IntSummaryStatistics summary_data =
                       stream.summaryStatistics();
  
        // Displaying the various summary data
        // about the elements of the stream
      //  System.out.println(summary_data);
    }
}
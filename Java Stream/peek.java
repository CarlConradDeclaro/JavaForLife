
// Java Program to Illustrate peek() Method
// of Stream class With Terminal Operation Count
 
// Importing required classes
import java.util.*;
 
// Main class
class Main {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating a list of Integers
        List<Integer> list
            = Arrays.asList(0, 2, 4, 6, 8, 10);
 
        // Using peek with count() method,Method
        // which is a terminal operation
        list.stream().peek(System.out::println).count();
    }
}

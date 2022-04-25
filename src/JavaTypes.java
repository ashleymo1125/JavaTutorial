import java.util.Date;

// This section is to review all the different types
public class JavaTypes {

    /*
    There are two types within Java:
    1. Primitive Types: Stores simple values
        a. byte
        b. short
        c. int
        d. long
        e. float
        f. double
        g. char
        h. boolean
    2. Reference Types: Stores complex objects

     */

    /*
    Something to note is that all highlighted orange are reserved keywords
     in Java which means they cannot be used as variable names
     */

    //Primitive Types:
    byte myAge = 30;
    int viewsCount = 123_456_789;
    long majorViewsCount = 3_123_456_789L;
    float myPrice = 101.32F;
    char letter = 'A';
    boolean amIPretty = true;


    //Reference Types:

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
    }
}

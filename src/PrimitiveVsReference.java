import java.awt.*;

public class PrimitiveVsReference {
    /*
    Okay so we know that we use primitive types to store simple values while
    reference types are used to store complex objects. There's also a very important
    difference between these types when it comes to memory management.
     */

    public static void main(String[] args)
    {
        byte a = 1;
        byte b = a;
        a = 2;

        /*
        Within this pointer example, these primitive types are referring to the same memory address
        therefore makes them dependant of eachother
         */
        byte x;
        byte y;

        Point point1 = new Point(x=1, y=1);
        Point point2 = point1;
        point1.x=300;
        point1.y=500;

        System.out.println(b);

        /*At the moment, we have two separate variables x and y that are stored at
          different memory locations. They are completely independent of each other.
          In other words, if I change X, Y will not be affected.

          |     |    X   |    Y   |       |
          |     |    1   |    X   |       |
         */

        System.out.println(point2);

        /*
        Reference types are copied by the references whereas primitive types are
        copied by their value which are completely independent of each other.
         */

    }
}

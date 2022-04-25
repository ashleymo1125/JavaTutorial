import java.util.Arrays;
public class LetsLearnAboutArrays {

    public static void main(String[] args)
    {
        /*
        Arrays are used to store multiple values in a single variable, instead
        of declaring separate variables for each value
         */

        int[] myArray = {1,2,3};

        System.out.println(Arrays.toString(myArray));
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }

        int[][] multi = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(multi));
    }

}

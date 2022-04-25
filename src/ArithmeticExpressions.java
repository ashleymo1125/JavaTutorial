public class ArithmeticExpressions
{
    public static void main(String[] args)
    {
        int result = 10 / 3;
        int result2 = result++;
        System.out.println("RESULT: " + result);
        System.out.println("RESULT 2: " + result2);

        result += 200;
        System.out.println("RESULT: " + result);
    }
}

public class MessingWithStrings {

    public static void main(String[] args)
        {
            String message = new String("BBQ sauce for life");
            // String message = new String("BBQ sauce for life"); ====== String message = "BBQ sauce for life"
            System.out.println(message + "!!!!!!!!!!!!!");
            System.out.println(message.endsWith("!!!!!!!!!!!!!"));
            System.out.println(message.length());

            String messageTwo = "Hello \"world\"";
            System.out.println(messageTwo);
        }
}

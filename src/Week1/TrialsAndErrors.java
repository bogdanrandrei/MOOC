package Week1;

public class TrialsAndErrors {
    public static void main(String[] args) {
        System.out.println("Aici e text printat cu printLN"); //Evidentiez funtionalitatea printLN
        System.out.println("Aici e text printat simplu."); //Evidentiez funtionaliatea print simplu
        System.out.println("Hello World!"); //System.out.println prints the text and the line break
                                            //System.out.print prints the text without the line break at the end
        System.out.println("First\nSecond\nThird"); // BACKSPACEN(\n) \n, which stands for a line break.
        System.out.println("RAND LIBER INTENTIONAT");
        String text = "includes text";
        System.out.println("The variable's type is text. Its value is " + text);
        int wholeNumber = 123;
        System.out.println("The variable's type is integer. Its value is  " + wholeNumber);
        double decimalNumber = 3.141592653;
        System.out.println("The variable's type is decimal number. Its value is " + decimalNumber);
        boolean isTrue = true;
        System.out.println("The variable's type is truth value. Its value is " + isTrue);

        //String text = "yabbadabbadoo!";
        //text = 42; // Does not work! :(

        double decimalNumber2 = 0.42;
        decimalNumber2 = 1;

        String greeting = "Hi ";
        String name = "John";
        String goodbye = ", and goodbye!";
        String sentence = greeting + name + goodbye;
        System.out.println(sentence);


    }
}

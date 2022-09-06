import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Already feeling the boilerplate
        Scanner read = new Scanner(System.in);

        System.out.println("wanna see something?");
        String response = read.nextLine();
        if (Boolean.valueOf(response)) {
            int numberOne = 111111;
            int numberTwo = 1567;
            System.out.println("Multiplication! " + (numberOne * numberTwo));
            System.out.println("Addition! " + (numberOne + numberTwo));
            System.out.println("Division! " + (numberOne / numberTwo));
            System.out.println("Subtraction cuz I forgot! " + (numberOne - numberTwo));
            System.out.println("Division but working! " + ((double) numberOne / (double) numberTwo)); 
            // btw these casting things look absolutely *hideous*
            System.out.println("And modulus operandi! " + (numberOne % numberTwo)); 
            // though, there are bigger concerns to me
        } else  {
            System.out.println("Ok, your loss :)");
            // like why my spacebar started squeaking?
        }
        // nah, not doing the other things. syntax similar enough to C++ there for me to skip em
    }
}

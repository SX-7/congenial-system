import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //Already feeling the boilerplate
        Scanner read = new Scanner(System.in);
        
        System.out.println("Provide input, Sir/Madam?");
        String input = read.nextLine();
        //This might seem funny, but it actually is
        System.out.println("Big Cheese likes " + input);

    }
}

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //Already feeling the boilerplate
        Scanner read = new Scanner(System.in);
        int leIntVar = 123;
        boolean theTruth = false;
        double bananaSplitChallenge = 56.01;
        System.out.println("Here's some fun facts: " + leIntVar + theTruth + bananaSplitChallenge);
        System.out.println("Provide input, Sir/Madam?");
        String input = read.nextLine();
        //This might seem funny, but it actually is
        System.out.println("Big Cheese likes " + input);
        leIntVar = Integer.valueOf(input);
        //Actually, it can be done with Boolean, and Double too
        System.out.println("Here's some less fun facts: " + leIntVar + theTruth + bananaSplitChallenge);
    }
}

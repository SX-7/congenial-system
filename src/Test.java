import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //Already feeling the boilerplate
        Scanner read = new Scanner(System.in);
        
        //Sike, big refactor. Or rewrite. Idk
        int numberOne = 111111;
        int numberTwo =1567;
        System.out.println("Multiplication! "+ (numberOne*numberTwo));
        System.out.println("Addition! "+ (numberOne+numberTwo));
        System.out.println("Division! "+ (numberOne/numberTwo));
        System.out.println("Subtraction cuz I forgot! "+(numberOne-numberTwo));
        System.out.println("Division but working! "+ ((double)numberOne/(double)numberTwo)); //btw these casting things look absolutely *hideous*
        System.out.println("And modulus operandi! "+ (numberOne%numberTwo)); //though, there are bigger concerns to me
    }
}

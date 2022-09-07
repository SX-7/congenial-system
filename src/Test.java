import java.util.Scanner;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> home = new ArrayList<>();
        home.add(new Person("BigCheese", 9999));
        home.add(new Person("SmolCheese", 68));
        Scanner input = new Scanner(System.in);
        System.out.println("Input name and age seperated by ',' pass nothing to end");
        while (true) {
            String in = input.nextLine();
            if (!(in.length() == 0)) {
                if (!(in.contains(","))) {
                    continue;
                } else {
                    String[] res = in.split(",");
                    home.add(new Person(res[0], Integer.valueOf(res[1])));
                }
            } else {
                print(home);
                break;
            }
        }
    }

    public static void print(ArrayList<Person> ppl){
        for (Person per : ppl) {
            System.out.println(per.getName()+" aged "+per.getAge());
        }
    }
}
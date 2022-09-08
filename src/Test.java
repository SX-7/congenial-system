import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner file = new Scanner(Paths.get("README.md"))) {
            while (file.hasNextLine()) {
                String temp = file.nextLine();
                if (!(temp.isEmpty())){
                    lines.add(temp);
                }                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("File contents are:");
        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("In total "+ lines.size()+" lines");
    }
}
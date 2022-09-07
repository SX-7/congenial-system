import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Element number one, but actually index 0");
        //System.out.println(lista.get(1)); // This will actually crash lmao
        lista.add("Index 1");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
    }
}
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        print(lista);
        lista.remove(2); // this will remove element with val of 3
        print(lista);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1); 
        // Intriguing! Seems to store them as objects, and doesn't allow such duplicates
        // As they're the same object with the same reference of smth
        lista.add(4);
        lista.remove(Integer.valueOf(4));
        if(lista.contains(4)){
            System.out.println("Something went wrong...");
        } else {
            System.out.println("All good :+1:, 4 was not found");
        }
        System.out.println(lavg(lista));
    }
    public static void print(ArrayList<Integer> list) {
        for (Integer iter : list) {
            System.out.println(iter);
        }
    }
    public static double lavg(ArrayList<Integer> list) {
        int sum = 0;
        if(list.size()>0){
            for (Integer iter : list) {
                sum+=iter;
            }
            return (double) sum / list.size();
        } else {
            return -1;
        }
    }
}
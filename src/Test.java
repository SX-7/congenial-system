public class Test {
    public static void main(String[] args) {
        int[] lista = new int[10];
        lista[0]=1;
        lista[1]=2;
        lista[2]=3;
        lista[3]=4;
        print(lista);
        lista[4]=5;
        lista[5]=1;
        lista[6]=1;
        lista[7]=1;
        lista[8]=1; 
        print(lista);
        //lista.remove(Integer.valueOf(4));
        //if(lista.contains(4)){
        //    System.out.println("Something went wrong...");
        //} else {
        //    System.out.println("All good :+1:, 4 was not found");
        //} // no such fun as easily with the default list
        System.out.println(lavg(lista));
    }
    public static void print(int[] list) {
        for (int iter : list) {
            System.out.println(iter);
        }
    }
    public static double lavg(int[] list) {
        int sum = 0;
        if(list.length>0){
            for (Integer iter : list) {
                sum+=iter;
            }
            return (double) sum / list.length;
        } else {
            return -1;
        }
    }
}
import java.util.*;

public class Programa5 {
    public static void main(String[] args) {
        int[] v = { 10, 22, -3, 40, -5 };
        System.out.println(v);
        for (int x : v)
            System.out.println(x);
        System.out.println(Arrays.toString(v));

        System.out.println("trabajando con ArrayList");
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int x : v)
            lista.add(x);
        System.out.println(lista);
        lista.add(100);
        System.out.println(lista);
        Vector<Integer> vector = new Vector<Integer>();
    }
}

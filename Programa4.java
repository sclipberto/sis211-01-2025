import java.util.stream.*;

//estructuras repetitivas
public class Programa4 {
    public static void main(String[] args) {
        System.out.println("0-4 con while");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i = i + 1;
        }

        System.out.println("0-4 con for");
        for (i = 0; i < 5; i = i + 1)
            System.out.println(i);

        System.out.println("0-4 con for(each)");
        int rango[] = { 0, 1, 2, 3, 4 };
        for (int j : rango)
            System.out.println(j);

        System.out.println("0-4 con range-foreach");
        IntStream.range(0, 5).forEach(System.out::println);

        System.out.println("0-4 con do-while");
        i = 10;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i < 5);
    }
}

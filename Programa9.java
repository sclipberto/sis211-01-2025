import java.util.*;

public class Programa9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("introduzca 10 notas");
        for (int i = 0; i < 10; i++) {
            int x = input.nextInt();
            lista.add(x);
        }

        int suma = 0;
        for (int nota : lista)
            suma += nota;// suma=suma+nota;

        double promedio = suma / (double) lista.size();
        System.out.println("promedio=" + promedio);

        System.out.println("las notas por encima del promedio son:");
        for (int nota : lista)
            if (nota > promedio)
                System.out.println(nota);
    }
}

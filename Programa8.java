import java.util.*;
//leer las calificaciones de 10 estudiantes 
//y mostrar por pantalla el promedio de todas las notas
//mostrar los estudiantes que esten por encima del promedio

public class Programa8 {
    public static void main(String[] args) {
        System.out.println("introduzca las notas de 10 estudiantes");
        Scanner input = new Scanner(System.in);

        int v[] = new int[10];// declaramos el vector

        for (int i = 0; i < v.length; i++)// lectura de valores
            v[i] = input.nextInt();

        int suma = 0;// sumar todos los elementos para calcular el promedio
        for (int x : v)
            suma = suma + x;

        double promedio = suma / (double) v.length;// calculamos el promedio

        System.out.println("promedio=" + promedio);

        System.out.println("Las notas por encima del promedio son:");
        for (int nota : v)
            if (nota > promedio)
                System.out.println(nota);
    }
}

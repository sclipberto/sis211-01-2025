import java.util.*;

public class Programa10 {
    public static boolean esPalindromo(int x) {
        if (x < 0)
            return false;
        int v, a, c = (int) Math.log10(x);
        while (x != 0) {
            a = x % 10;
            v = x / (int) Math.pow(10, c);
            // System.out.println("primer digito=" + v);
            // System.out.println("ultimo digito=" + a);
            if (v != a)
                return false;
            x = x - v * (int) Math.pow(10, c);
            x = x / 10;
            // System.out.println("nuevo x=" + x);
            c = c - 2;
        }
        return true;
    }

    public static boolean esPalindromo2(int x) {
        // String n = String.valueOf(x);
        // StringBuilder m = new StringBuilder(n);
        // String o = m.reverse().toString();
        // if (n.compareTo(o) == 0)
        // return true;
        String n = String.valueOf(x);
        if (n.compareTo(new StringBuilder(n).reverse().toString()) == 0)
            return true;
        return false;
    }

    public static boolean esPalindromo3(int x) {
        if (x < 0)
            return false;
        int invertido = 0, original = x;
        while (x != 0) {
            invertido = invertido * 10 + x % 10;
            x = x / 10;
        }
        if (original == invertido)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero entero:");
        int x = input.nextInt();
        if (esPalindromo2(x))
            System.out.println("es palindromo");
        else
            System.out.println("no es palindromo");

    }
}

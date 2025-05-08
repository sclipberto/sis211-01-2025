import java.util.*;

public class Programa3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int a = input.nextInt();
        System.out.println("Introduzca un numero:");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("suma=" + c);
        // if (c % 2 == 0)
        // System.out.println("Par");
        // else
        // System.out.println("Impar");
        System.out.println(c % 2 == 0 ? "Par" : "Impar");
        int modulo = c % 7;
        // if(modulo==0)
        // System.out.println("lunes");
        // else if(modulo==1)
        // System.out.println("martes");
        switch (modulo) {
            case 0:
                System.out.println("lunes");
                break;
            case 1:
                System.out.println("martes");
                break;
            case 2:
                System.out.println("miercoles");
                break;
            case 3:
                System.out.println("jueves");
                break;
            case 4:
                System.out.println("viernes");
                break;
            case 5:
                System.out.println("sabado");
                break;
            case 6:
                System.out.println("domingo");
                break;
            default:
                System.out.println("error");
        }
    }
}

import java.util.*;

public class Programa15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Participante> lista = new ArrayList<Participante>();
        do {
            System.out.println("1.-add participante");
            System.out.println("2.-listar participantes");
            System.out.println("3.-Calcular total recaudado");
            System.out.println("4.-listar deudores");
            System.out.println("5.-salir");
            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    Participante nuevo = new Participante();
                    nuevo.leerDatos();
                    lista.add(nuevo);
                    break;
                case 2:
                    for (Participante p : lista)
                        p.mostrarDatos();
                    break;
                case 3:
                    int total = 0;
                    for (Participante p : lista)
                        total += p.pagoRealizado;
                    System.out.println("Total recaudado de " + lista.size() + " participante(s):" + total);
                    break;
                case 4:
                    System.out.println("Lista de deudores:");
                    for (Participante p : lista)
                        if (p.pagoRealizado < 100)
                            p.mostrarDatos();
                    break;
                case 5:
                    System.out.println("programa finalizado");
                    System.exit(0);
            }
        } while (true);
    }
}

class Participante {
    String nombre, apellido, ci;
    int pagoRealizado;

    public void leerDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        nombre = input.next();
        System.out.println("Introduzca el apellido:");
        apellido = input.next();
        System.out.println("Introduzca el CI:");
        ci = input.next();
        System.out.println("Introduzca el pago realizado:");
        pagoRealizado = input.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("Nombre:" + nombre + " " + apellido);
        System.out.println("CI:" + ci);
        System.out.println("Monto Pagado:" + pagoRealizado);
    }
}
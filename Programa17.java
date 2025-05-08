import java.util.*;

public class Programa17 {
    static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.-add participante");
        System.out.println("2.-listar participantes");
        System.out.println("3.-Calcular total recaudado");
        System.out.println("4.-listar deudores");
        System.out.println("5.-salir");
        int opcion = input.nextInt();
        return opcion;
    }

    public static void main(String[] args) {
        ParticipanteRepositorio repositorio = new ParticipanteRepositorio();
        ParticipanteServicio servicio = new ParticipanteServicio();
        do {
            int opcion = menu();
            Runnable[] acciones = new Runnable[] {
                    () -> {
                        Participante p = servicio.leerDatos();
                        servicio.registrarParticipante(p);
                    },
                    () -> servicio.listarParticipantes(),
                    () -> System.out.println(servicio.calcularMontoRecaudado()),
                    () -> servicio.listarDeudores(100),
                    () -> System.exit(0)
            };
            acciones[opcion - 1].run();
        } while (true);

    }
}

class Participante {
    String nombre, apellido, ci;
    int pagoRealizado;
}

class ParticipanteRepositorio {
    ArrayList<Participante> lista = new ArrayList<Participante>();
}

class ParticipanteServicio {
    ParticipanteRepositorio repositorio = new ParticipanteRepositorio();

    Participante leerDatos() {
        Participante p = new Participante();
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre=");
        p.nombre = input.next();
        System.out.println("Apellido=");
        p.apellido = input.next();
        System.out.println("CI=");
        p.ci = input.next();
        System.out.println("Monto Pagado=");
        p.pagoRealizado = input.nextInt();
        return p;
    }

    void mostrarDatos(Participante p) {
        System.out.println("Nombre=" + p.nombre);
        System.out.println("Apellido=" + p.apellido);
        System.out.println("CI=" + p.ci);
        System.out.println("Pago=" + p.pagoRealizado);
    }

    void registrarParticipante(Participante p) {
        repositorio.lista.add(p);
    }

    void listarParticipantes() {
        for (Participante p : repositorio.lista) {
            mostrarDatos(p);
        }
    }

    void listarDeudores(int montoTotal) {
        for (Participante p : repositorio.lista) {
            if (p.pagoRealizado < montoTotal)
                mostrarDatos(p);
        }
    }

    int calcularMontoRecaudado() {
        int total = 0;
        for (Participante p : repositorio.lista) {
            total += p.pagoRealizado;
        }
        return total;
    }
}

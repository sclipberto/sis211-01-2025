import java.util.Scanner;

public class Programa19 {
    public static void main(String[] args) {
        DatosPersonales d[] = new DatosPersonales[2];// = new DatosPersonales();
        Medico m = new Medico();
        d[0] = (DatosPersonales) m;
        Enfermera e = new Enfermera();
        d[1] = e;
        for (DatosPersonales p : d)
            p.leerDatos();

        for (DatosPersonales p : d)
            p.mostrarDatos();
    }
}

class DatosPersonales {
    String nombre, apellido, ci;
    int edad;

    DatosPersonales() {
        System.out.println("constructor clase padre");
    }

    void leerDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre:");
        nombre = input.next();
        System.out.println("Apellido:");
        apellido = input.next();
        System.out.println("CI:");
        ci = input.next();
        System.out.println("Edad:");
        edad = input.nextInt();
    }

    void mostrarDatos() {
        System.out.println("Nombre:" + nombre + " " + apellido);
        System.out.println("CI:" + ci);
        System.out.println("Edad:" + edad);
    }
}

class Medico extends DatosPersonales {
    String especialidad;

    Medico() {
        super();
        System.out.println("ejecutando el constructor de medico");
    }

    void leerDatos() {
        super.leerDatos();
        Scanner input = new Scanner(System.in);
        System.out.println("Especialidad:");
        especialidad = input.next();
    }

    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Especialidad:" + especialidad);
    }
}

class Enfermera extends DatosPersonales {
    String turno;

    Enfermera() {
        super();
        System.out.println("ejecutando el constructor de enfermera");
    }

    void leerDatos() {
        super.leerDatos();
        Scanner input = new Scanner(System.in);
        System.out.println("Turno:");
        turno = input.next();
    }

    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Turno:" + turno);
    }
}

class Portero extends DatosPersonales {
}

class Jefe extends DatosPersonales {
}

class Limpieza extends DatosPersonales {
}
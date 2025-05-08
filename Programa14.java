public class Programa14 {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        // e.nombre = "Pepe";
        e.setNombre("Pepe");
        e.edad = 19;
        System.out.println("Nombre=" + e.getNombre());
        System.out.println("Edad=" + e.edad);
    }
}

class Estudiante {
    private String nombre;
    int edad;

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }
}
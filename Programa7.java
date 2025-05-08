public class Programa7 {
    static int suma(int a, int b) {
        int c = a = b;
        return c;
    }

    static int resta(int a, int b) {
        return a - b;
    }

    static int multiplicacion(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("error de division por cero");
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("division=" + division(6, 0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("suma=" + suma(2, 3));
    }
}

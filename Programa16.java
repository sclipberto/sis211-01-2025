
//almacen
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa16 {
    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.-registrar producto");
        System.out.println("2.-listar productos");
        System.out.println("3.-listar productos vencidos");
        System.out.println("4.-eliminar");
        System.out.println("5.-editar");
        System.out.println("6.-consumir");
        System.out.println("7.-salir");
        return input.nextInt();
    }

    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        ArrayList<Producto> lista = new ArrayList<>();
        do {
            int opcion = menu();
            switch (opcion) {
                case 1:
                    Producto nuevo = new Producto();
                    nuevo.leerDatos();
                    lista.add(nuevo);
                    break;
                case 2:
                    for (Producto p : lista)
                        p.mostrarDatos();
                    break;
                case 3:
                    Date actual = new Date();
                    for (Producto p : lista) {
                        if (actual.compareTo(p.fechaVencimiento) > 0)
                            p.mostrarDatos();
                    }
                    break;
                case 4:
                    System.out.println("Codigo a Eliminar:");
                    String ce = input.next();
                    boolean eliminado = false;
                    for (Producto p : lista)
                        if (p.codigo.compareTo(ce) == 0) {
                            lista.remove(p);
                            eliminado = true;
                            break;
                        }
                    if (!eliminado)
                        System.out.println("El producto no existe");
                    break;
                case 5:
                    System.out.println("Codigo a Editar:");
                    String cedicion = input.next();
                    boolean editado = false;
                    for (Producto p : lista)
                        if (p.codigo.compareTo(cedicion) == 0) {
                            Producto cambio = new Producto();
                            cambio.leerDatos();
                            lista.remove(p);
                            lista.add(cambio);
                            editado = true;
                            break;
                        }
                    if (!editado)
                        System.out.println("El producto no existe");
                    break;
                case 6:
                    System.out.println("Codigo que se consumio:");
                    String cconsumo = input.next();
                    boolean actualizado = false;
                    for (Producto p : lista)
                        if (p.codigo.compareTo(cconsumo) == 0) {
                            p.cantidad -= 1;
                        }
                    if (!actualizado)
                        System.out.println("El producto no existe");
                    break;
                case 7:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);
    }
}

class Producto {
    String nombre, codigo;
    Date fechaRegistro, fechaVencimiento;
    int cantidad;

    public void leerDatos() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre del producto:");
        nombre = input.next();
        System.out.println("Codigo del producto:");
        codigo = input.next();
        System.out.println("Fecha de vencimiento:");
        String aux = input.next();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        fechaVencimiento = sdf.parse(aux);
        System.out.println("Cantidad del producto:");
        cantidad = input.nextInt();
        fechaRegistro = new Date();
    }

    public void mostrarDatos() {
        System.out.println("Producto:" + nombre + "\tCodigo:" + codigo + "\tCantidad:" + cantidad);
        System.out.println("Fecha de vencimiento:" + fechaVencimiento.toString());
        System.out.println("Fecha de registro:" + fechaRegistro.toString());
    }
}
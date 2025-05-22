package Programa24;

public class Venta {
    Producto producto;
    int cantidad;
    float precioTotal;

    public Venta(Producto p) {
        this.producto = p;
    }

    void setCantidad(int c) throws Exception {
        if (c > producto.cantidad)
            throw new Exception("Cantidad fuera de stock");
        cantidad = c;
        precioTotal = cantidad * producto.precio;
    }
}

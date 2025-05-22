package Programa24;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class VentanaListarProducto extends JFrame {
    JTable tblProductos;
    JLabel lblImagen;

    public VentanaListarProducto() {
        setTitle("Lista de Productos");
        setSize(400, 300);
        setLayout(new GridLayout(1, 2, 10, 10));
        Object[][] datos = new Object[Datos.lista.size()][3];
        String[] titulos = new String[] { "Producto", "Talla", "Cantidad" };
        int i = 0;
        for (Producto p : Datos.lista)
            datos[i++] = new Object[] { p.nombre, p.talla, p.cantidad };
        tblProductos = new JTable(new DefaultTableModel(datos, titulos));
        add(new JScrollPane(tblProductos));
        lblImagen = new JLabel();
        add(lblImagen);
        tblProductos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                cargarImagen();
            }
        });
    }

    void cargarImagen() {
        int fila = tblProductos.getSelectedRow();
        System.out.println("" + fila);
        if (fila >= 0) {
            String rutaImagen = Datos.lista.get(fila).imagen;
            ImageIcon imagen = new ImageIcon(rutaImagen);
            lblImagen.setIcon(imagen);
        }
    }
}

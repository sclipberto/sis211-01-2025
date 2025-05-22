package Programa24;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class VentanaVenta extends JFrame {
    JTable tblProductos;
    JLabel lblImagen;
    JTextField txtCantidad;
    JButton btnOk, btnCancel;

    public VentanaVenta() {
        setTitle("Nueva Venta");
        setSize(400, 500);
        setLayout(new GridLayout(3, 2, 15, 15));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField();
        add(txtCantidad);
        btnOk = new JButton("Ok");
        btnCancel = new JButton("Cancelar");
        add(btnOk);
        add(btnCancel);
        btnCancel.addActionListener(e -> this.dispose());
        btnOk.addActionListener(e -> {
            try {
                int fila = tblProductos.getSelectedRow();
                Producto p = Datos.lista.get(fila);
                Venta nuevaVenta = new Venta(p);
                int cantidad = Integer.parseInt(txtCantidad.getText());
                nuevaVenta.setCantidad(cantidad);
                Datos.ventas.add(nuevaVenta);
                p.cantidad -= cantidad;
                JOptionPane.showMessageDialog(null, "Registrado.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
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

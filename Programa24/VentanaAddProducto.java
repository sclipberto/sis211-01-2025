package Programa24;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaAddProducto extends JFrame {
    JTextField txtNombre, txtCantidad, txtCosto, txtPrecio, txtTalla, txtImagen;
    JButton btnOk, btnCancel, btnSeleccionarArchivo;
    JPanel panelImagen;

    public VentanaAddProducto() {
        setTitle("Registrar Producto");
        setLayout(new GridLayout(7, 2, 15, 15));
        setSize(270, 300);
        txtNombre = new JTextField();
        txtCantidad = new JTextField("0");
        txtCosto = new JTextField("0");
        txtPrecio = new JTextField("0");
        txtTalla = new JTextField();
        txtImagen = new JTextField();
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancel");
        btnSeleccionarArchivo = new JButton("...");
        panelImagen = new JPanel();
        panelImagen.setLayout(new FlowLayout());
        txtImagen.setPreferredSize(new Dimension(60, 25));
        panelImagen.add(txtImagen);
        panelImagen.add(btnSeleccionarArchivo);
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Talla:"));
        add(txtTalla);
        add(new JLabel("Cantidad:"));
        add(txtCantidad);
        add(new JLabel("Costo:"));
        add(txtCosto);
        add(new JLabel("Precio:"));
        add(txtPrecio);
        add(new JLabel("Imagen:"));
        // add(txtImagen);
        add(panelImagen);
        add(btnOk);
        add(btnCancel);

        btnSeleccionarArchivo.addActionListener(e -> {
            JFileChooser seleccionar = new JFileChooser();
            seleccionar.addChoosableFileFilter(new FileNameExtensionFilter("Imagen", "png", "jpg", "gif"));
            int r = seleccionar.showOpenDialog(this);
            if (r == JFileChooser.APPROVE_OPTION)
                txtImagen.setText(seleccionar.getSelectedFile().getAbsolutePath());
        });

        btnOk.addActionListener(e -> {
            Producto nuevo = new Producto();
            nuevo.nombre = txtNombre.getText();
            nuevo.talla = txtTalla.getText();
            nuevo.precio = Float.parseFloat(txtPrecio.getText());
            nuevo.costo = Float.parseFloat(txtCosto.getText());
            nuevo.cantidad = Integer.parseInt(txtCantidad.getText());
            nuevo.imagen = txtImagen.getText();
            Datos.lista.add(nuevo);

            JOptionPane.showMessageDialog(null, "Registrado");
            this.dispose();
        });
    }
}

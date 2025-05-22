package Programa25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;

public class VentanaNuevaTarea extends JFrame {
    JTextField txtFecha;
    JTextArea txtDescripcion;
    JButton btnOk, btnCancelar;
    // JDateChooser jcFecha;

    public VentanaNuevaTarea() {
        setTitle("Nueva tarea");
        setSize(400, 150);
        setLayout(new GridLayout(3, 2, 15, 15));
        txtDescripcion = new JTextArea();
        txtFecha = new JTextField();
        JScrollPane scrollDescripcion = new JScrollPane(txtDescripcion);
        add(new JLabel("Descripcion:"));
        add(scrollDescripcion);
        add(new JLabel("Fecha Limite:"));
        add(txtFecha);
        btnOk = new JButton("Ok");
        btnCancelar = new JButton("Cancelar");
        add(btnOk);
        add(btnCancelar);
        btnOk.addActionListener(e -> {
            new ServicioTarea()
                    .agregarTarea(txtDescripcion.getText(),
                            txtFecha.getText());
            JOptionPane.showMessageDialog(null, "Registrado.");
            dispose();
        });
        btnCancelar.addActionListener(e -> dispose());
    }
}

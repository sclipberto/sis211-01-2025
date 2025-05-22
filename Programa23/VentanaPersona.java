package Programa23;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class VentanaPersona extends JFrame {
    JTextField txtNombre, txtApellido, txtEdad;
    JButton btnOk, btnCancel;

    public VentanaPersona() {
        setSize(250, 180);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 15, 15));
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtEdad = new JTextField();
        btnOk = new JButton("Ok");
        btnCancel = new JButton("Cancel");

        getContentPane().add(new JLabel("Nombre:"));
        getContentPane().add(txtNombre);
        getContentPane().add(new JLabel("Apellido:"));
        getContentPane().add(txtApellido);
        getContentPane().add(new JLabel("Edad:"));
        getContentPane().add(txtEdad);
        getContentPane().add(btnOk);
        getContentPane().add(btnCancel);

        btnOk.addActionListener(e -> {
            Persona nueva = new Persona();
            nueva.nombre = txtNombre.getText();
            nueva.apellido = txtApellido.getText();
            nueva.edad = Integer.parseInt(txtEdad.getText());
            Datos.personas.add(nueva);
            JOptionPane.showMessageDialog(null, "Registrado correctamente");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
        });
    }
}

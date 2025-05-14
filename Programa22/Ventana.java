package Programa22;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Ventana extends JFrame {
    JLabel lblNombre, lblEdad;
    JTextField txtNombre, txtEdad;
    JButton btnOk, btnSalir;
    ArrayList<Persona> personas = new ArrayList<>();

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(3, 2, 10, 10));
        lblNombre = new JLabel("Nombre:");
        lblEdad = new JLabel("Edad:");
        txtNombre = new JTextField();
        txtEdad = new JTextField();
        btnOk = new JButton("OK");
        btnSalir = new JButton("Salir");

        getContentPane().add(lblNombre);
        getContentPane().add(lblEdad);
        getContentPane().add(txtNombre);
        getContentPane().add(txtEdad);
        getContentPane().add(btnOk);
        getContentPane().add(btnSalir);

        btnOk.addActionListener(e -> {
            Persona nueva = new Persona();
            nueva.nombre = txtNombre.getText();
            nueva.edad = txtEdad.getText();
            personas.add(nueva);
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
        });
        btnSalir.addActionListener(e -> System.exit(0));
    }
}

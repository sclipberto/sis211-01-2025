package Programa25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaMain extends JFrame {
    JPanel panel;
    JButton btnNuevatarea, btnListartareas, btnCambiarEstado;

    public VentanaMain() {
        setTitle("Principal");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        btnNuevatarea = new JButton("Nuevo");
        panel.add(btnNuevatarea);
        btnListartareas = new JButton("Listar");
        panel.add(btnListartareas);
        add(panel, BorderLayout.NORTH);
        btnNuevatarea.addActionListener(e -> new VentanaNuevaTarea().setVisible(true));
        btnListartareas.addActionListener(e -> new VentanaListar().setVisible(true));
        btnCambiarEstado = new JButton("Estado");
        panel.add(btnCambiarEstado);
        btnCambiarEstado.addActionListener(e -> new VentanaEditarEstado().setVisible(true));
    }
}

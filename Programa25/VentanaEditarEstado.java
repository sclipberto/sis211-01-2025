package Programa25;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class VentanaEditarEstado extends JFrame {
    JPanel panel;
    JTable tblTareas;
    JButton btnCambiarEstado;

    public VentanaEditarEstado() {
        setTitle("Estado de Tarea");
        setSize(450, 300);
        setLayout(new GridLayout(1, 2));
        ServicioTarea s = new ServicioTarea();
        DefaultTableModel modelo = new DefaultTableModel(s.getDatos(), s.getTitles());
        tblTareas = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tblTareas);
        add(scroll);
        btnCambiarEstado = new JButton("Cambiar estado");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(btnCambiarEstado);
        add(panel);
        btnCambiarEstado.addActionListener(e -> {
            int f = tblTareas.getSelectedRow();
            Datos.tareas.get(f).estado = !Datos.tareas.get(f).estado;
            modelo.setDataVector(s.getDatos(), s.getTitles());
            // tblTareas.setModel(modelo);
        });
    }
}

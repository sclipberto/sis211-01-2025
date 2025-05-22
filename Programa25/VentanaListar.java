package Programa25;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;

public class VentanaListar extends JFrame {
    JTable tblTareas;

    public VentanaListar() {
        setTitle("Lista de tareas");
        setSize(400, 400);
        ServicioTarea s = new ServicioTarea();
        tblTareas = new JTable(new DefaultTableModel(s.getDatos(), s.getTitles()));
        add(new JScrollPane(tblTareas));
    }
}

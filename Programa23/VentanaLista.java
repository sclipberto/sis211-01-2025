package Programa23;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.table.*;

public class VentanaLista extends JFrame {
    JTable tabla;

    public VentanaLista() {

        setSize(250, 250);
        setTitle("Lista");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        Object[][] datos = new Object[Datos.personas.size()][3];
        int i = 0;
        for (Persona p : Datos.personas) {
            datos[i] = new Object[] { p.nombre, p.apellido, p.edad };
            i += 1;
        }
        String[] titulos = new String[] { "Nombre", "Apellido", "Edad" };
        tabla = new JTable(new DefaultTableModel(datos, titulos));
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }
}

package Programa25;

import java.sql.*;

public class ServicioTarea {
    public void agregarTarea(String d, String f) {
        Tarea nueva = new Tarea();
        nueva.descripcion = d;
        nueva.fechaLimite = Date.valueOf(f);
        Datos.tareas.add(nueva);
    }

    public Object[][] getDatos() {
        Object[][] datos = new Object[Datos.tareas.size()][4];
        int i = 0;
        for (Tarea t : Datos.tareas)
            datos[i++] = t.getTarea();
        return datos;
    }

    public String[] getTitles() {
        String[] titulos = new String[] { "ID", "Descripcion", "Fecha Limite", "Estado" };
        return titulos;
    }
}

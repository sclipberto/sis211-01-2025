package Programa25;

import java.util.*;

public class Tarea {
    int id;
    String descripcion;
    Date fechaLimite;
    boolean estado;// true=tarea completada,false=pendiente

    public Tarea() {
        id = Datos.tareas.size() + 1;
        estado = false;
    }

    public Object[] getTarea() {
        return new Object[] { id, descripcion, fechaLimite, estado ? "Completado" : "Pendiente" };
    }
}

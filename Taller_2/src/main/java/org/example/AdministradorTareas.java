package org.example;

import java.util.ArrayList;
import java.util.List;

public class AdministradorTareas {
    private List<String> tareas;

    public void adicionarTarea(String tarea) {
        if (this.tareas == null) {
            this.tareas = new ArrayList<>();
        }
        this.tareas.add(tarea);

    }

    public List<String> optenerTarea() {

        return this.tareas;
    }

}
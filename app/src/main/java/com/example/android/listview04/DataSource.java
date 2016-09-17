package com.example.android.listview04;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    static List TAREAS = new ArrayList<Tarea>();

    static{

        TAREAS.add(new Tarea("Tarea 1","09:30",R.drawable.blue));
        TAREAS.add(new Tarea("Tarea 2","10:00",R.drawable.green));
        TAREAS.add(new Tarea("Tarea 3","10:30",R.drawable.red));
        TAREAS.add(new Tarea("Tarea 4","12:40",R.drawable.yellow));
        TAREAS.add(new Tarea("Tarea 5","18:00",R.drawable.blue));

    }

}

package org.example.models.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Directorio {
    private String nombre;
    private Directorio padre;
    private String path;

    public Directorio(String nombre, Directorio padre, String path) {
        this.nombre = nombre;
        this.padre = padre;
        this.path = path;
    }


}

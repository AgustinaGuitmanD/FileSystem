package org.example.models.repositories.impl;

import org.example.models.entities.Archivo;
import org.example.models.entities.Directorio;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ArchivoRepository {
    private List<Archivo> archivos;
    public void save(String name, Directorio ubicacion) {
        // TODO
    }
    public List<String> findall(Directorio ubicacion ) {
        List<Archivo> archivosFiltrados = archivos.stream().filter(a -> a.getUbicacion() == ubicacion).toList();
        return archivosFiltrados.stream().map(a-> a.getNombre()).toList();
    }
}

package org.example.models.repositories.impl;
import org.example.models.entities.Directorio;
import org.example.models.repositories.IDirectorioRepository;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.Set;
@Repository
public class DirectorioRepository implements IDirectorioRepository {
    // lo puse como un set para asegurarme que haya solo uno, quizás
    // estaría bueno ver si hace falta un hashMap que permita tener
    // una clave,
    Set<Directorio> directorios;
    @Override
    public void save(Directorio nuevoDirectorio) {
        if(directorios.stream()
                .allMatch(d -> !Objects.equals(d.getNombre(), nuevoDirectorio.getNombre()) &&
                d.getPadre() != nuevoDirectorio.getPadre())) {
            directorios.add(nuevoDirectorio);
        }
    }

    public Directorio siDirecEsValidaDevolver(String Path) {
        directorios.stream()
                .filter(dir -> dir.getPath().equals(Path))
                .findFirst()
                .orElse(null);
    }
}

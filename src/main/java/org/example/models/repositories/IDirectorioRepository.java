package org.example.models.repositories;

import org.example.models.entities.Directorio;

public interface IDirectorioRepository {
    public void save(Directorio nuevoDirectorio); // persiste el directorio
    public Directorio siDirecEsValidaDevolver(String Path);
}

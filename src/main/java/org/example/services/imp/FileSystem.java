package org.example.services.imp;

import org.example.models.entities.Archivo;
import org.example.models.entities.Directorio;
import org.example.services.IArchivoService;
import org.example.services.IDirectorioService;
import org.example.services.IFileSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileSystem implements IFileSystemService {
    Directorio ubicacionActual;

    @Autowired
    IArchivoService archivoService;
    @Autowired
    IDirectorioService directorioService;
    public String ls() {
        System.out.println("Nombres de los archivos en el directorio actual");
        List<String> archivos= archivoService.findAll(ubicacionActual);
        System.out.println("Nombres de las carpetas en el directorio actual");
        // asumí que las carpetas son las que
        directorioService.findAll(ubicacionActual);
        List<String> todo ; //aca concateno las 2 listas
        return todo;
    }
    public String pwd() {
        return ubicacionActual.getPath();;
    }
}

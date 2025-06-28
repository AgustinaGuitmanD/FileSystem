package org.example.services.imp;

import org.example.models.entities.Archivo;
import org.example.models.entities.Directorio;
import org.example.models.repositories.IArchivoRepository;
import org.example.services.IArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchivoService implements IArchivoService {
    @Autowired
    IArchivoRepository archivoRepository;
    @Override
    public void touch(String fileName) {
        if(this.esValido(fileName)) {
            Archivo  NuevoArchivo = new Archivo(fileName, ubicacionActual);
            archivoRepository.save();
            System.out.println("El archivo se creo con éxito");
        }
        System.out.println("El archivo no se pudo crear");
    }

    public boolean esValido(String fileName) {
        List<Character> caracteresInvalidos =  List.of('/', '\\', '*', '?', '"'
                                                    , '<', '>', '|', ':');;
        private boolean valido = false;
        for(Character caracter : caracteresInvalidos) {
            if(fileName.contains((String.valueOf(caracter))))  valido = true;
            valido = false;
        }
        return valido;
    }

    public findAll(Directorio directorio) {
        return archivoRepository.findall(directorio);
    }
}

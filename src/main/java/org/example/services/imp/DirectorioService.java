package org.example.services.imp;

import org.example.models.entities.Directorio;
import org.example.models.repositories.IDirectorioRepository;
import org.example.services.IDirectorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorioService implements IDirectorioService {

    @Autowired
    IDirectorioRepository directorioRepository;
    Directorio ubicacionActual;

    public void mkdir(String dirName) {
        ubicacionActual = this.obtenerDirectorioActual();
        //TODO buildear el directorio
        Directorio nuevoDir = new Directorio(dirName, ubicacionActual.getPadre(),ubicacionActual.getPath());
        directorioRepository.save(nuevoDir);
    }

    public Directorio obtenerDirectorioActual() {
        //TODO
        return null;
    }

    public void cd(String dirName) {
        // aca convertiria el dirName que me llega  de string a un Directorio
        // concatenando la direccion actual con el dirName, supongo que todos los cd
        // no son paths absolutos
        String nuevoPath = null;
        Directorio nuevoDirecActual;
        if(dirName.equals("...")) {
            // no hago ninguna verificación acerca del padre porque supongo que si
            // el directorio en el que estamos parados existe es porque el padre es valido
            nuevoDirecActual = ubicacionActual.getPadre();
        }
        else {
            nuevoPath = ubicacionActual.getPath() + "/" + dirName;
            nuevoDirecActual = directorioRepository.siDirecEsValidaDevolver(nuevoPath);
        }

        if(nuevoDirecActual != null) this.ubicacionActual = nuevoDirecActual;
    }
}

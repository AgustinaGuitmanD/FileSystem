package org.example.controllers;

import org.example.services.IArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArchivosController {
    @Autowired
    IArchivoService archivoService;
   @PostMapping
    public void touch(String fileName) {
       archivoService.touch(fileName);
   }

}

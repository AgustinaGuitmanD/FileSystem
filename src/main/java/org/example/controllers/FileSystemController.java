package org.example.controllers;

import org.example.services.imp.FileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.FileSystems;

@Controller
public class FileSystemController {
    @Autowired
    IFileSystemService fileSystemService;
    @GetMapping
    public String ls() {
        fileSystemService.ls(); // acá quería tener un DTO pero no llegué con el tiempo
    }
}

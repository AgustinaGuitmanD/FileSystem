package org.example.controllers;

import org.example.services.imp.DirectorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DirectorioController {
    @Autowired
    DirectorioService directorioService;

    @PostMapping
}

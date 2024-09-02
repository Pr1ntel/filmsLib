package org.example.filmslib.jwt_controllers;

import lombok.AllArgsConstructor;
import org.example.filmslib.models.Films;
import org.example.filmslib.services.FilmsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/secure/")
@AllArgsConstructor
public class SecureController {
    private final FilmsService filmsService;

    @GetMapping(value = "/all-films")
    public List<Films> getAll() {
        return filmsService.getAll();
    }
}

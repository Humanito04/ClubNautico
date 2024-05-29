package com.example.controller;

import com.example.personas.Persona;
import com.example.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona){
        return this.personaService.crearPersona(persona);
    }

    @GetMapping
    public List<Persona> listarPersona(){
        return this.personaService.listarPersonas();
    }

    @DeleteMapping("/{id}")
    public void deletePersona(int id){
        this.personaService.borrarPersona(id);
    }


    @PutMapping
    public Persona actualizarPersona(Persona persona){
        return this.personaService.actualizarPersona(persona);
    }
}

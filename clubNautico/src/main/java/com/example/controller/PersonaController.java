package com.example.controller;

import com.example.personas.Persona;
import com.example.services.PersonaService;
import com.example.dto.PersonaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona crearPersona(@RequestBody PersonaDTO personaDTO){
        return this.personaService.crearPersona(personaDTO);
    }

    @GetMapping
    public List<Persona> listarPersona(){
        return this.personaService.listarPersonas();
    }

    @GetMapping("/{id}")
    public Persona obtenerPersona(@PathVariable Integer id){
        return this.personaService.getPersonaById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable Integer id){
        this.personaService.borrarPersona(id);
    }


    @PutMapping("/{id}")
    public PersonaDTO actualizarPersona(@RequestBody PersonaDTO personaDTO,@PathVariable Integer id){
        return this.personaService.updatePersona(personaDTO,id);
    }
}

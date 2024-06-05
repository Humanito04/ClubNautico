package com.example.controller;

import com.example.personas.Persona;
import com.example.services.PersonaService;
import com.example.services.dto.PersonaDTO;
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

    @DeleteMapping("/{id}")
    public void deletePersona(Integer id){
        this.personaService.borrarPersona(id);
    }


    @PutMapping
    public PersonaDTO actualizarPersona(PersonaDTO personaDTO, Integer idPersona){
        return this.personaService.actualizarPersona(personaDTO,idPersona);
    }
}

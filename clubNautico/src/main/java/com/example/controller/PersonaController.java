package com.example.controller;

import com.example.personas.Persona;
import com.example.responses.Response;
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
    public Response<Persona> crearPersona(@RequestBody PersonaDTO personaDTO){
        Persona persona = this.personaService.crearPersona(personaDTO);
        return new Response<>("Persona creada correctamente", persona);
    }

    @GetMapping
    public Response<List<Persona>> listarPersona(){
        List<Persona> personas = this.personaService.listarPersonas();
        return new Response<>("Lista de personas", personas);
    }

    @GetMapping("/{id}")
    public Response<Persona> obtenerPersona(@PathVariable Integer id){
        Persona persona = this.personaService.getPersonaById(id);
        return new Response<>("Persona obtenida", persona);
    }

    @DeleteMapping("/{id}")
    public Response<Void> borrarPersona(@PathVariable Integer id){
        this.personaService.borrarPersona(id);
        return new Response<>("Persona eliminada correctamente", null);
    }

    @PutMapping("/{id}")
    public Response<PersonaDTO> actualizarPersona(@RequestBody PersonaDTO personaDTO, @PathVariable Integer id){
        PersonaDTO personaActualizada = this.personaService.updatePersona(personaDTO, id);
        return new Response<>("Persona actualizada correctamente", personaActualizada);
    }
}


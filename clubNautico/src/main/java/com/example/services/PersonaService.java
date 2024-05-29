package com.example.services;

import com.example.personas.Persona;
import com.example.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
     private PersonaRepository personaRepo;

    public Persona crearPersona(Persona persona){
        return this.personaRepo.save(persona);
    }

    public void borrarPersona(int id){
        personaRepo.deleteById(id);
    }

    public List<Persona> listarPersonas(){
        return this.personaRepo.findAll();
    }

    public Persona getPersonaById(int id){
        return this.personaRepo.findById(id).get();
    }

    public Persona actualizarPersona(Persona persona){
        return this.personaRepo.save(persona);
    }


}

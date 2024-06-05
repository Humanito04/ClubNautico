package com.example.services;

import com.example.personas.Persona;
import com.example.repositories.PersonaRepository;
import com.example.services.dto.PersonaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
     private PersonaRepository personaRepo;

    private final ModelMapper MODELMAPPER = new ModelMapper();

    public PersonaDTO convertToDto(Persona persona){
        return MODELMAPPER.map(persona,PersonaDTO.class);
    }

    public Persona convertToEntity(PersonaDTO personaDTO){
        return MODELMAPPER.map(personaDTO,Persona.class);
    }

    public Persona crearPersona(PersonaDTO personaDTO){
        Persona persona = convertToEntity(personaDTO);
        Persona personaP = this.personaRepo.save(persona);
        return personaP;
    }

    public void borrarPersona(Integer id){
        personaRepo.deleteById(id);
    }

    public List<Persona> listarPersonas(){
        return this.personaRepo.findAll();
    }

    public Persona getPersonaById(Integer id){
        return this.personaRepo.findById(id).get();
    }

    public PersonaDTO actualizarPersona(PersonaDTO personaDTO, Integer idPersona){
        Persona personaUpdate = this.personaRepo.findById(idPersona).orElseThrow(()
                -> new RuntimeException("Persona not found with id " + idPersona));

        BeanUtils.copyProperties(personaDTO, personaUpdate);
        Persona actualizaPersona = this.personaRepo.save(personaUpdate);

        return convertToDto(personaUpdate);
    }


}

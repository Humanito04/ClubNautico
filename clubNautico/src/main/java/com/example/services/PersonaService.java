package com.example.services;

import com.example.personas.Persona;
import com.example.repositories.PersonaRepository;
import com.example.dto.PersonaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepo;

    private final ModelMapper modelMapper = new ModelMapper();

    public PersonaDTO convertToDto(Persona persona) {
        return modelMapper.map(persona, PersonaDTO.class);
    }

    public Persona convertToEntity(PersonaDTO personaDTO) {
        return modelMapper.map(personaDTO, Persona.class);
    }

    public Persona crearPersona(PersonaDTO personaDTO) {
        Persona persona = convertToEntity(personaDTO);
        return this.personaRepo.save(persona);
    }

    public void borrarPersona(Integer id) {
        if (personaRepo.existsById(id)) {
            personaRepo.deleteById(id);
        } else {
            throw new RuntimeException("Persona no encontrada con id " + id);
        }
    }

    public List<Persona> listarPersonas() {
        return this.personaRepo.findAll();
    }

    public Persona getPersonaById(Integer id) {
        return this.personaRepo.findById(id).orElseThrow(() ->
                new RuntimeException("Persona no encontrada con id: " + id));
    }

    public PersonaDTO updatePersona(PersonaDTO personaDTO, Integer idPersona) {
        Persona personaUpdate = this.personaRepo.findById(idPersona).orElseThrow(() ->
                new RuntimeException("Persona no encontrada con id: " + idPersona));

        BeanUtils.copyProperties(personaDTO, personaUpdate);
        this.personaRepo.save(personaUpdate);
        return convertToDto(personaUpdate);
    }
}


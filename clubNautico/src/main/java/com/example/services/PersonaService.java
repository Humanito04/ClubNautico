package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.personas.Persona;
import com.example.repositories.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepo;
	
	public Persona crearPersona(Persona persona) {
		return personaRepo.save(persona);
	}
	
	public void borrarPersona(int id) {
		personaRepo.deleteById(id);
	}
	
	public List<Persona> listarPersonas(){
		return personaRepo.findAll();
	}
	
	public Persona buscarPersonaPorId(int id) {
		return personaRepo.findById(id).orElse(null);
	}
}

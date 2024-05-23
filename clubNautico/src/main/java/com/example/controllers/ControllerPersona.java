package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.personas.Persona;
import com.example.services.PersonaService;

public class ControllerPersona {

	@Autowired
	PersonaService personaService;
	
	@GetMapping("/persona")
	@ResponseBody
	public List<Persona> listarPersona(){
		return personaService.listarPersonas()
;	}
	
	@PostMapping("/persona")
	@ResponseBody
	public Persona crearPersona(@RequestBody Persona persona) {
		return personaService.crearPersona(persona);
	}
	
	
}

package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personas.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}

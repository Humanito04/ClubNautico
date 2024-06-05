package com.example.repositories;

import com.example.personas.Salida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalidaRepository extends JpaRepository<Salida, Integer> {

}

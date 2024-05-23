package com.example.personas;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Barco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_barco;
	
	private String matricula;
	
	
	private String nombre;
	
	
	private int numAmarres;
	
	
	private double cuota;
	
	
	private int id_socio;
	
	@ManyToOne
	private Persona persona;
	
	
	
}

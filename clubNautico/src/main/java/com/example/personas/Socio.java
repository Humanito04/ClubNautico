package com.example.personas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Socio  extends Persona{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_socio;


	
	
	
	
	

	
	
}

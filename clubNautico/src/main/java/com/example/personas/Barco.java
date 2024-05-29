package com.example.personas;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "barco")
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
	@JoinColumn(name = "persona")
	private Persona persona;


}

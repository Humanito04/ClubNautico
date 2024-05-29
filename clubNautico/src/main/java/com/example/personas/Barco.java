package com.example.personas;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

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
	private Persona persona;

	@ManyToOne
	private Salida salida;


}

package com.example.personas;

import jakarta.persistence.*;
import lombok.*;

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
	private Integer id;
	
	private String matricula;
	
	
	private String nombre;
	
	
	private int numAmarres;
	
	
	private double cuota;
	
	
	private Integer id_socio;
	
	@ManyToOne
	private Persona persona;

	@OneToMany(mappedBy = "barco", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Salida> salida;


}

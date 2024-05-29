package com.example.personas;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "salida")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSalida;

	private LocalDateTime fecha_hora_salida;
	
	private String destino;
	
	private int id_patron;


	@ManyToOne
	private Barco barco;

	@ManyToOne
	private Persona persona;
}

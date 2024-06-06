package com.example.personas;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
	private Integer id;

	private LocalDateTime fecha_hora_salida;
	
	private String destino;
	
	private Integer id_patron;


	@ManyToOne
	@JsonBackReference
	private Barco barco;

	@ManyToOne
	@JsonBackReference
	private Persona persona;
}

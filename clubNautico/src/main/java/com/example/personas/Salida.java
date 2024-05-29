package com.example.personas;

import java.time.LocalDateTime;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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


}

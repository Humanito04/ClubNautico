package com.example.personas;

import java.time.LocalDateTime;

import jakarta.persistence.Basic;
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

	public int getIdSalida() {
		return idSalida;
	}

	public void setIdSalida(int idSalida) {
		this.idSalida = idSalida;
	}

	public LocalDateTime getFecha_hora_salida() {
		return fecha_hora_salida;
	}

	public void setFecha_hora_salida(LocalDateTime fecha_hora_salida) {
		this.fecha_hora_salida = fecha_hora_salida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getId_patron() {
		return id_patron;
	}

	public void setId_patron(int id_patron) {
		this.id_patron = id_patron;
	}
	
	
	
	
}

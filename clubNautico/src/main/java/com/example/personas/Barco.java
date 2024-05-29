package com.example.personas;

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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

	public int getId_barco() {
		return id_barco;
	}

	public void setId_barco(int id_barco) {
		this.id_barco = id_barco;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumAmarres() {
		return numAmarres;
	}

	public void setNumAmarres(int numAmarres) {
		this.numAmarres = numAmarres;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
}

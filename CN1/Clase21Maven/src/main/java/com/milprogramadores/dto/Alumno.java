package com.milprogramadores.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALUMNO")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "apellido")
	private String lastName;
	
	@OneToOne
	@JoinColumn(name = "carrera", nullable = true, unique = true)
	private Carrera carrier;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Carrera getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrera carrier) {
		this.carrier = carrier;
	}
	
	
	
	
}

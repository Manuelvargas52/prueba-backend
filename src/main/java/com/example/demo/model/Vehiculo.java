package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int conductor_id;
    private int modelo;
    private String placa;
    private int capacidad;  


    
    public Vehiculo() {}

    public Vehiculo(int conductor_id, int modelo, String placa, int capacidad) {
		super();
		this.conductor_id = conductor_id;
		this.modelo = modelo;
		this.placa = placa;
		this.capacidad = capacidad;
	}

	// Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

	public int getConductor_id() {
		return conductor_id;
	}

	public void setConductor_id(int conductor_id) {
		this.conductor_id = conductor_id;
	}
    
}
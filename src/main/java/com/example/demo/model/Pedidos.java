package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table (name = "pedidos")

public class Pedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  id;
	private String  tipo_pedido;
	private String direccion  ;
	private String conductor_id;
	
	
	public Pedidos() {
	}
	
	


	public Pedidos(String tipo_pedido, String direccion, String conductor_id) {
		super();
		this.tipo_pedido = tipo_pedido;
		this.direccion = direccion;
		this.conductor_id = conductor_id;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTipo_pedido() {
		return tipo_pedido;
	}


	public void setTipo_pedido(String tipo_pedido) {
		this.tipo_pedido = tipo_pedido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getConductor_id() {
		return conductor_id;
	}


	public void setConductor_id(String conductor_id) {
		this.conductor_id = conductor_id;
	}

	
	


	
	
}

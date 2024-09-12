package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "conductor")
public class Conductor {

    

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   
    private String identificacion;

  
    private String apellido;

  
    private String nombre;

   
    private String telefono;

    
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "capacidad", nullable = false)
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "conductor_id", nullable = false)
    private Pedidos pedidos;

    
	public Conductor() {
		super();
	}


	public Conductor(Long id, String identificacion, String apellido, String nombre, String telefono, String direccion,
			Vehiculo vehiculo, Pedidos pedidos) {
		super();
		this.id = id;
		this.identificacion = identificacion;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.vehiculo = vehiculo;
		this.pedidos = pedidos;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	public Pedidos getPedidos() {
		return pedidos;
	}


	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	

   
}
package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pedidos;

import com.example.demo.service.PedidosService;

@RestController
@RequestMapping("/pedidos/")
public class PedidosRest {
	
	@Autowired
	private PedidosService pedidosService;
	
	@GetMapping
	private ResponseEntity<List<Pedidos>> getAllVehiculo(){
		return ResponseEntity.ok(pedidosService.findAll());
	}
	
	
	

}

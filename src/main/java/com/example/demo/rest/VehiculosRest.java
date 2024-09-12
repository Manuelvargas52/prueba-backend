package com.example.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Vehiculo;
import com.example.demo.service.VehiculoService;

@RestController
@RequestMapping("/vehiculo/")
public class VehiculosRest {
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@GetMapping
	private ResponseEntity<List<Vehiculo>> getAllVehiculo(){
		return ResponseEntity.ok(vehiculoService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Vehiculo> saveVehiculo(@RequestBody Vehiculo  vehiculo){
		try {
			Vehiculo VehiculoGuardado = vehiculoService.save(vehiculo);
			return ResponseEntity.created(new URI("/vehiculo/"+VehiculoGuardado.getId())).body(VehiculoGuardado);
					} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	 @DeleteMapping (value ="delete/{id}")
	    private ResponseEntity<Boolean> deleteVehiculo(@PathVariable ("id") Long id){
	    	vehiculoService.deleteById(id);
	    	return ResponseEntity.ok(!(vehiculoService.findById(id)!=null));
	    }

}

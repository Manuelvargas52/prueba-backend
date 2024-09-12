package com.example.demo.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Conductor;
import com.example.demo.service.ConductorService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/conductor/")
public class ConductorRest {

    @Autowired
    private ConductorService conductorService;

    @GetMapping
    public List<Conductor> getAllConductores() {
        return conductorService.findAll();
    }

    @PostMapping
    public ResponseEntity<Conductor> saveConductor(@RequestBody Conductor conductor) {
    	try {
    		Conductor ConductorGuardado = conductorService.save(conductor);
            return ResponseEntity.created (new URI("/conductor/"+ConductorGuardado.getId())).body(ConductorGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
        
    }
    @DeleteMapping (value ="delete/{id}")
    private ResponseEntity<Boolean> deleteConductor(@PathVariable ("id") Long id){
    	conductorService.deleteById(id);
    	return ResponseEntity.ok(!(conductorService.findById(id)!=null));
    }
}
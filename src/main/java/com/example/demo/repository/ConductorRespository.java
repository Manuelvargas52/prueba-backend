package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Conductor;

public interface ConductorRespository extends JpaRepository<Conductor, Long> {

}

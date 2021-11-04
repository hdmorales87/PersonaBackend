package com.example.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.persona.model.Estado;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
}

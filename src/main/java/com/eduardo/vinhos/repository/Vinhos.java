package com.eduardo.vinhos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{
	
	List<Vinho> findByNomeContainingIgnoreCase(String nome);
}

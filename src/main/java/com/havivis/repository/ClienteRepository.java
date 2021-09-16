package com.havivis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.havivis.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	public List<Cliente> findAllByNomeContainingIgnoreCase(String nome);

}

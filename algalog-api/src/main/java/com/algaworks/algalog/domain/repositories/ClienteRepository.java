package com.algaworks.algalog.domain.repositories;

import com.algaworks.algalog.domain.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.algaworks.algalog.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

   @PersistenceContext
   private EntityManager manager;

   @GetMapping("/clientes")
   public List<Cliente> listar() {
      return manager.createQuery("from Cliente", Cliente.class).getResultList();
   }
}

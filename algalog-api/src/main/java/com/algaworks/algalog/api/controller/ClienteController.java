package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import com.algaworks.algalog.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

   @GetMapping("/clientes")
   public List<Cliente> listar() {

      Cliente cliente1 = new Cliente();
      cliente1.setId(1L);
      cliente1.setNome("João");
      cliente1.setTelefone("(47) 99999-1111");
      cliente1.setEmail("joao.sousa@contato.com");

      Cliente cliente2 = new Cliente();
      cliente2.setId(2L);
      cliente2.setNome("Maria");
      cliente2.setTelefone("(47) 98888-4444");
      cliente2.setEmail("maria.silva@contato.com");

      return Arrays.asList(cliente1, cliente2);
   }
}

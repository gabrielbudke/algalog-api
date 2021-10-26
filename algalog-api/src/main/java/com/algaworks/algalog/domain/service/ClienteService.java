package com.algaworks.algalog.domain.service;

import com.algaworks.algalog.domain.exception.NegocioException;
import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.domain.repository.ClienteRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ClienteService {

   private ClienteRepository clienteRepository;

   @Transactional
   public Cliente salvar(Cliente cliente) {
      // Usando a api de stream do Java
      boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail()).stream()
            .anyMatch(clienteExistente -> !clienteExistente.equals(cliente));

      if (emailEmUso) {
         throw new NegocioException("Já existe um cliente cadastrado com este e-mail");
      }

          
      

      return clienteRepository.save(cliente);

   }

   @Transactional
   public void excluir(Long clienteId) {
      clienteRepository.deleteById(clienteId);
   }

}

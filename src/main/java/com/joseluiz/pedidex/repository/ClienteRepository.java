package com.joseluiz.pedidex.repository;

import com.joseluiz.pedidex.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "clientes", collectionResourceRel = "cliente")
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

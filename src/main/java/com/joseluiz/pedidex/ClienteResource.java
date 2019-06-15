package com.joseluiz.pedidex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "clientes", collectionResourceRel = "cliente")
public interface ClienteResource extends JpaRepository<Cliente, Long> {
}

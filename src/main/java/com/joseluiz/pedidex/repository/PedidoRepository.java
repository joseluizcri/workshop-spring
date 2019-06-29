package com.joseluiz.pedidex.repository;

import com.joseluiz.pedidex.model.Cliente;
import com.joseluiz.pedidex.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "pedidos", collectionResourceRel = "pedido")
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

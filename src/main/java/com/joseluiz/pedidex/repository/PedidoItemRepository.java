package com.joseluiz.pedidex.repository;

import com.joseluiz.pedidex.model.Pedido;
import com.joseluiz.pedidex.model.PedidoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "pedidos/itens", collectionResourceRel = "pedidoItem")
public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {
}

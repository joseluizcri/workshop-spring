package com.joseluiz.pedidex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "produtos", collectionResourceRel = "produto")
public interface ProdutoResource extends JpaRepository<Produto, Long> {

}

package com.joseluiz.pedidex.repository;

import com.joseluiz.pedidex.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "produtos", collectionResourceRel = "produto")
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

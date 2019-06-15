package com.joseluiz.pedidex.service;

import com.joseluiz.pedidex.model.Produto;
import com.joseluiz.pedidex.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto inserir (Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto update (Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> findAll () {
        return produtoRepository.findAll();
    }
}

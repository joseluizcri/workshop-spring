package com.joseluiz.pedidex.resource;

import com.joseluiz.pedidex.model.Produto;
import com.joseluiz.pedidex.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Produto> findAll() {
        return produtoService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Produto insert(@RequestBody Produto produto) {
        return produtoService.inserir(produto);
    }
}

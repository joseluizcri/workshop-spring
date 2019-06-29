package com.joseluiz.pedidex.resource;

import com.joseluiz.pedidex.model.Pedido;
import com.joseluiz.pedidex.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Pedido> findAll() {
        return pedidoService.findAll();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pedido insert(@RequestBody Pedido pedido) {
        return pedidoService.inserir(pedido);
    }

    @GetMapping(path = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Pedido findOne(@PathVariable("id") Long id) {
        return pedidoService.findOne(id);
    }

}

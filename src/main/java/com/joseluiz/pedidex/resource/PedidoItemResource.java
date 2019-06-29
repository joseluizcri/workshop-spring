package com.joseluiz.pedidex.resource;

import com.joseluiz.pedidex.model.PedidoItem;
import com.joseluiz.pedidex.service.PedidoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedidos/itens")
public class PedidoItemResource {

    @Autowired
    private PedidoItemService pedidoService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<PedidoItem> findAll() {
        return pedidoService.findAll();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PedidoItem insert(@RequestBody PedidoItem pedido) {
        return pedidoService.inserir(pedido);
    }

    @GetMapping(path = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public PedidoItem findOne(@PathVariable("id") Long id) {
        return pedidoService.findOne(id);
    }

}

package com.joseluiz.pedidex.resource;

import com.joseluiz.pedidex.model.Cliente;
import com.joseluiz.pedidex.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente insert(@RequestBody Cliente cliente) {
        return clienteService.inserir(cliente);
    }
}

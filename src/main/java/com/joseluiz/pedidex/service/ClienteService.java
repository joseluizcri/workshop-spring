package com.joseluiz.pedidex.service;

import com.joseluiz.pedidex.model.Cliente;
import com.joseluiz.pedidex.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente inserir (Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente update (Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll () {
        return clienteRepository.findAll();
    }
}

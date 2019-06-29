package com.joseluiz.pedidex.service;

import com.joseluiz.pedidex.model.Pedido;
import com.joseluiz.pedidex.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido inserir (Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Pedido update (Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> findAll () {
        return pedidoRepository.findAll();
    }

    public Pedido findOne(Long id) {
        return pedidoRepository.findById(id).get();
    }
}

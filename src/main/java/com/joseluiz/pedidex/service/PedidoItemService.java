package com.joseluiz.pedidex.service;

import com.joseluiz.pedidex.model.PedidoItem;
import com.joseluiz.pedidex.repository.PedidoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoItemService {

    @Autowired
    private PedidoItemRepository pedidoItemRepository;

    public PedidoItem inserir (PedidoItem pedido){
        return pedidoItemRepository.save(pedido);
    }

    public PedidoItem update (PedidoItem pedido) {
        return pedidoItemRepository.save(pedido);
    }

    public List<PedidoItem> findAll () {
        return pedidoItemRepository.findAll();
    }

    public PedidoItem findOne(Long id) {
        return pedidoItemRepository.findById(id).get();
    }
}

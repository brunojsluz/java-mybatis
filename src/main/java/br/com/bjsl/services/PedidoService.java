package br.com.bjsl.services;

import br.com.bjsl.entidades.Pedido;
import br.com.bjsl.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscarPedido(Long codigo) {
        return pedidoRepository.buscarPedido(codigo);
    }
}

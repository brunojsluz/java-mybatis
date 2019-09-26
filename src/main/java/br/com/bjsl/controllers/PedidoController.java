package br.com.bjsl.controllers;

import br.com.bjsl.entidades.Pedido;
import br.com.bjsl.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{codigo}")
    public Pedido getPedido(@PathVariable("codigo") Long codigo) {
        return pedidoService.buscarPedido(codigo);
    }
}

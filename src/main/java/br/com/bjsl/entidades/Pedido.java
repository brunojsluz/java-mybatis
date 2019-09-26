package br.com.bjsl.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private Long codigo;
    private String nomeCliente;
    private String descricao;
    private List<DetalhePedido> detalhePedidoList;

}

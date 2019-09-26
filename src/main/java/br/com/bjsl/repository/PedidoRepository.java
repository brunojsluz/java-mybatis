package br.com.bjsl.repository;

import br.com.bjsl.entidades.DetalhePedido;
import br.com.bjsl.entidades.Pedido;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository {

    @Select(value = "SELECT * FROM PEDIDO WHERE CODIGO = #{codigo}")
    @Results(value = {
            @Result(property = "codigo", column = "codigo"),
            @Result(property = "nomeCliente", column = "codigo"),
            @Result(property = "descricao", column = "codigo"),
            @Result(property = "detalhePedidoList", column = "codigo", javaType = List.class, many = @Many(select = "buscarDetalhe"))
    })
    public Pedido buscarPedido(Long codigo);

    @Select(value = "SELECT * FROM DETALHES_PEDIDO WHERE codigo_pedido = #{codigoPedido}")
    @Results(value = {
            @Result(property = "codigo", column = "codigo"),
            @Result(property = "descricaoItem", column = "descricao_item"),
            @Result(property = "valor", column = "valor"),
            @Result(property = "quantidade", column = "quantidade")
    })
    public List<DetalhePedido> buscarDetalhe(Long codigoPedido);
}

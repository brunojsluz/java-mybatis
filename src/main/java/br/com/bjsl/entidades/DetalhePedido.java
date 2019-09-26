package br.com.bjsl.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetalhePedido {

    private Long codigo;
    private String descricaoItem;
    private BigDecimal valor;
    private Double quantidade;
}

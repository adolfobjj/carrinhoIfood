package com.ifood.carrinhoapi.resource.dto;

import com.ifood.carrinhoapi.model.Cliente;
import lombok.Data;

import java.util.List;

@Data
public class CarrinhoDto {
    private ClienteDto cliente;
    private List<ItemDto> itens;
    private Double valorTotal;
    private String formaPagamento;
    private boolean fechada;


}

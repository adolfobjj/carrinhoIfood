package com.ifood.carrinhoapi.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ItemDto {

    private Long id;
    private Long produtoId;
    private Long carrinhoId;
    private Long restauranteId;
    private int quantidade;

}


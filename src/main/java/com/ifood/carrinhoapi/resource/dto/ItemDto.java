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
    private Long produtoId;
    private int quantidade;
    private Long idSacola;

}

package com.ifood.carrinhoapi.service;

import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    public ItemDto toDto(Item item) {
        ItemDto dto = new ItemDto();
        dto.setId(item.getId());
        dto.setProdutoId(item.getProduto().getId());
        dto.setCarrinhoId(item.getCarrinho().getId());
        dto.setRestauranteId(item.getRestaurante().getId());
        dto.setQuantidade(item.getQuantidade());
        return dto;
    }

}

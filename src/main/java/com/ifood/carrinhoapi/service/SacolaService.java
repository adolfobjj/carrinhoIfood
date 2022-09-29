package com.ifood.carrinhoapi.service;

import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.model.Sacola;
import com.ifood.carrinhoapi.resource.dto.ItemDto;

public interface SacolaService {

    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id,int formaPagamento);
}

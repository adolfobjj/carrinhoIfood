package com.ifood.carrinhoapi.service;

import com.ifood.carrinhoapi.enumeration.FormaPagamento;
import com.ifood.carrinhoapi.model.Carrinho;
import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.resource.dto.CarrinhoDto;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import org.springframework.stereotype.Service;
@Service
public interface CarrinhoService {
    Carrinho criarCarrinho(CarrinhoDto carrinhoDto);
    Item incluirItemNoCarrinho(ItemDto itemDto);
    Carrinho verCarrinho(Long id);
    Carrinho fecharCarrinho(Long id, FormaPagamento formaPagamento);



    ItemDto toDto(Item item);

    Carrinho fecharCarrinho(Long idCarrinho);
}


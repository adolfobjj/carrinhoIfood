package com.ifood.carrinhoapi.service;

import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.model.Sacola;

public interface SacolaService {

    Item incluirItemNaSacola();
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id,int formaPagamento);
}

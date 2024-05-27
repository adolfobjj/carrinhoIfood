package com.ifood.carrinhoapi.service;

import com.ifood.carrinhoapi.model.Restaurante;
import org.springframework.stereotype.Service;

@Service
public interface RestauranteService {
    Restaurante criarRestaurante(Restaurante restaurante);
    Restaurante verRestaurante(Long id);

}

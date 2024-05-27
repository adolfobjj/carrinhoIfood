package com.ifood.carrinhoapi.service.impl;

import com.ifood.carrinhoapi.model.Restaurante;
import com.ifood.carrinhoapi.repository.RestauranteRepository;
import com.ifood.carrinhoapi.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class RestauranteServiceImp implements RestauranteService {

    private final RestauranteRepository restauranteRepository;

    @Override
    public Restaurante criarRestaurante(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    @Override
    public Restaurante verRestaurante(Long id) {
        return restauranteRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Restaurante não encontrado com ID: " + id));
    }


}

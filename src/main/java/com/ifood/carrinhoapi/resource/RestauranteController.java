package com.ifood.carrinhoapi.resource;

import com.ifood.carrinhoapi.model.Restaurante;
import com.ifood.carrinhoapi.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurantes")
@RequiredArgsConstructor
@Repository
public class RestauranteController {

    private final RestauranteService restauranteService;

    @PostMapping
    public Restaurante criarRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteService.criarRestaurante(restaurante);
    }

    @GetMapping("/{id}")
    public Restaurante verRestaurante(@PathVariable Long id) {
        return restauranteService.verRestaurante(id);
    }


}

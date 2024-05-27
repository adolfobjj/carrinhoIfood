package com.ifood.carrinhoapi.resource;


import com.ifood.carrinhoapi.enumeration.FormaPagamento;
import com.ifood.carrinhoapi.model.Carrinho;
import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.resource.dto.CarrinhoDto;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import com.ifood.carrinhoapi.service.CarrinhoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/carrinho")
public class CarrinhoResource {

    private final CarrinhoService carrinhoService;

    @PostMapping("/criar")
    public Carrinho criarCarrinho(@RequestBody CarrinhoDto carrinhoDto){
        return carrinhoService.criarCarrinho(carrinhoDto);
    }

    @PostMapping("/adicionar-item")
    public Item incluirItemNoCarrinho(@RequestBody ItemDto itemDto){
        return carrinhoService.incluirItemNoCarrinho(itemDto);
    }

    @GetMapping("/{id}")
    public Carrinho verCarrinho(@PathVariable("id") Long id){
        return carrinhoService.verCarrinho(id);
    }

    @PatchMapping("/fechar/{id}")
    public Carrinho fecharCarrinho(@PathVariable("id") Long id, @RequestParam("formaPagamento") FormaPagamento formaPagamento){
        return carrinhoService.fecharCarrinho(id, formaPagamento);
    }
}

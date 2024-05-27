package com.ifood.carrinhoapi.service.impl;

import com.ifood.carrinhoapi.enumeration.FormaPagamento;
import com.ifood.carrinhoapi.model.Carrinho;
import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.model.Produto;
import com.ifood.carrinhoapi.repository.CarrinhoRepository;
import com.ifood.carrinhoapi.repository.ProdutoRepository;
import com.ifood.carrinhoapi.resource.dto.CarrinhoDto;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import com.ifood.carrinhoapi.service.CarrinhoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CarrinhoServiceImp implements CarrinhoService {

    private final CarrinhoRepository carrinhoRepository;
    private final ProdutoRepository produtoRepository;

    @Override
    @Transactional
    public Carrinho criarCarrinho(CarrinhoDto carrinhoDto) {
        Carrinho carrinho = new Carrinho();
        carrinho.setCliente(carrinhoDto.getCliente());
        carrinho.setValorTotal(0.0);
        carrinho.setFechada(false);
        return carrinhoRepository.save(carrinho);
    }

    @Override
    @Transactional
    public Item incluirItemNoCarrinho(ItemDto itemDto) {
        Carrinho carrinho = carrinhoRepository.findById(itemDto.getCarrinhoId())
                .orElseThrow(() -> new NoSuchElementException("Carrinho não encontrado com ID: " + itemDto.getCarrinhoId()));

        Produto produto = produtoRepository.findById(itemDto.getProdutoId())
                .orElseThrow(() -> new NoSuchElementException("Produto não encontrado com ID: " + itemDto.getProdutoId()));

        Item item = new Item();
        item.setProduto(produto);
        item.setQuantidade(itemDto.getQuantidade());
        item.setCarrinho(carrinho);

        carrinho.getItens().add(item);
        carrinho.setValorTotal(carrinho.getValorTotal() + (produto.getValorUnitario() * itemDto.getQuantidade()));
        carrinhoRepository.save(carrinho);

        return item;
    }

    @Override
    public Carrinho verCarrinho(Long id) {
        return carrinhoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Carrinho não encontrado com ID: " + id));
    }

    @Override
    @Transactional
    public Carrinho fecharCarrinho(Long id, FormaPagamento formaPagamento) {
        Carrinho carrinho = verCarrinho(id);
        if (carrinho.getItens().isEmpty()) {
            throw new RuntimeException("Adicione itens ao carrinho antes de fechar!");
        }

        carrinho.setFormaPagamento(formaPagamento);
        carrinho.setFechada(true);
        return carrinhoRepository.save(carrinho);
    }
}

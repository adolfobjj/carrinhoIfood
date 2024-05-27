package com.ifood.carrinhoapi.service.impl;

import com.ifood.carrinhoapi.enumeration.FormaPagamento;
import com.ifood.carrinhoapi.model.Carrinho;
import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.model.Produto;
import com.ifood.carrinhoapi.model.Restaurante;
import com.ifood.carrinhoapi.repository.*;
import com.ifood.carrinhoapi.resource.dto.CarrinhoDto;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import com.ifood.carrinhoapi.service.CarrinhoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarrinhoServiceImpl implements CarrinhoService {

    private final CarrinhoRepository carrinhoRepository;
    private final ProdutoRepository produtoRepository;
    private final RestauranteRepository restauranteRepository;
    private final ItemRepository itemRepository;
    private final ClienteRepository clienteRepository;

    @Override
    public Carrinho criarCarrinho(CarrinhoDto carrinhoDto) {
        log.info("Criando um novo carrinho");

        Carrinho carrinho = new Carrinho();
        carrinho.setCliente(clienteRepository.findById(carrinhoDto.getCliente().getId())
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontrado com ID: " + carrinhoDto.getCliente().getId())));
        carrinho.setValorTotal(carrinhoDto.getValorTotal());
        carrinho.setFormaPagamento(FormaPagamento.valueOf(carrinhoDto.getFormaPagamento()));
        carrinho.setFechada(carrinhoDto.isFechada());

        // Aqui você pode adicionar lógica para criar itens do carrinho, se necessário

        return carrinhoRepository.save(carrinho);
    }


    @Override
    public Item incluirItemNoCarrinho(ItemDto itemDto) {
        log.info("Buscando carrinho com ID: {}", itemDto.getCarrinhoId());
        Carrinho carrinho = carrinhoRepository.findById(itemDto.getCarrinhoId())
                .orElseThrow(() -> new NoSuchElementException("Carrinho não encontrado com ID: " + itemDto.getCarrinhoId()));

        log.info("Buscando produto com ID: {}", itemDto.getProdutoId());
        Produto produto = produtoRepository.findById(itemDto.getProdutoId())
                .orElseThrow(() -> new NoSuchElementException("Produto não encontrado com ID: " + itemDto.getProdutoId()));

        log.info("Buscando restaurante com ID: {}", itemDto.getRestauranteId());
        Restaurante restaurante = restauranteRepository.findById(itemDto.getRestauranteId())
                .orElseThrow(() -> new NoSuchElementException("Restaurante não encontrado com ID: " + itemDto.getRestauranteId()));

        Item item = new Item();
        item.setProduto(produto);
        item.setQuantidade(itemDto.getQuantidade());
        item.setCarrinho(carrinho);
        item.setRestaurante(restaurante);

        carrinho.getItens().add(item);
        carrinhoRepository.save(carrinho);

        log.info("Salvando item no carrinho");
        return itemRepository.save(item);
    }

    @Override
    public Carrinho verCarrinho(Long id) {
        return null;
    }
    @Override
    public Carrinho fecharCarrinho(Long idCarrinho) {
        return null;
    }

    @Override
    public Carrinho getCarrinhoById(Long id) {
        return null;
    }

    @Override
    public Carrinho atualizarCarrinho(Long id, Carrinho carrinhoAtualizado) {
        return null;
    }

    @Override
    public void deletarCarrinho(Long id) {

    }

    @Override
    public Carrinho fecharCarrinho(Long idCarrinho, FormaPagamento formaPagamento) {
        return null;
    }



    @Override
    public ItemDto toDto(Item item) {
        return null;
    }


}

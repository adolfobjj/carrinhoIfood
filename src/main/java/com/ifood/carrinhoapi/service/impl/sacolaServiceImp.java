package com.ifood.carrinhoapi.service.impl;

import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.model.Sacola;
import com.ifood.carrinhoapi.repository.SacolaRepository;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import com.ifood.carrinhoapi.service.SacolaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SacolaServiceImp implements SacolaService {

    private final SacolaRepository sacolaRepository;
    @Override
    public Item incluirItemNaSacola(ItemDto itemDto) {
        return null;
    }

    @Override
    public Sacola verSacola(Long id) {
        return sacolaRepository.findById(id).orElseThrow(
                ()->{
                    throw new RuntimeException("Essa sacola não existe!");
                }
        );
    }

    @Override
    public Sacola fecharSacola(Long id, int formaPagamento) {
        return null;
    }
}

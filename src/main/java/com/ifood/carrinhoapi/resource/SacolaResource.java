package com.ifood.carrinhoapi.resource;


import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.model.Sacola;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import com.ifood.carrinhoapi.service.SacolaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/carrinho")
public class SacolaResource {

    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
        return sacolaService.incluirItemNaSacola(new ItemDto());
    }
    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id){
        return sacolaService.verSacola(id);
    }
    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long idSacola,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(idSacola, formaPagamento);
    }

}

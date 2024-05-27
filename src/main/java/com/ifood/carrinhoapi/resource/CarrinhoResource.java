package com.ifood.carrinhoapi.resource;


import com.ifood.carrinhoapi.model.Carrinho;
import com.ifood.carrinhoapi.model.Item;
import com.ifood.carrinhoapi.resource.dto.ItemDto;
import com.ifood.carrinhoapi.service.CarrinhoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/carrinho")
public class CarrinhoResource {



    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping("/adicionar-item")
    public ResponseEntity<ItemDto> adicionarItem(@RequestBody ItemDto itemDto) {
        Item item = carrinhoService.incluirItemNoCarrinho(itemDto);
        return ResponseEntity.ok(carrinhoService.toDto(item));
    }

    @GetMapping("/{id}")
    public Carrinho verCarrinho(@PathVariable("id") Long id){
        return carrinhoService.verCarrinho(id);
    }

    @PatchMapping("/fechar-carrinho/{carrinhoId}")
    public Carrinho fecharCarrinho(@PathVariable("carrinhoId") Long idCarrinho,
                                   @RequestParam("formaPagamento") int formaPagamento){
        return carrinhoService.fecharCarrinho(idCarrinho, formaPagamento);
    }

}

package com.ifood.carrinhoapi.resource;


import com.ifood.carrinhoapi.model.Carrinho;
import com.ifood.carrinhoapi.resource.dto.CarrinhoDto;
import com.ifood.carrinhoapi.service.CarrinhoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    private final CarrinhoService carrinhoService;

    public CarrinhoController(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
    }

    @PostMapping("/criar")
    public ResponseEntity<Carrinho> criarCarrinho(@RequestBody CarrinhoDto carrinhoDto) {
        Carrinho novoCarrinho = carrinhoService.criarCarrinho(carrinhoDto);
        return ResponseEntity.ok(novoCarrinho);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Carrinho> getCarrinhoById(@PathVariable Long id) {
        Carrinho carrinho = carrinhoService.getCarrinhoById(id);
        return ResponseEntity.ok(carrinho);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carrinho> atualizarCarrinho(@PathVariable Long id, @RequestBody Carrinho carrinhoAtualizado) {
        Carrinho carrinho = carrinhoService.atualizarCarrinho(id, carrinhoAtualizado);
        return ResponseEntity.ok(carrinho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCarrinho(@PathVariable Long id) {
        carrinhoService.deletarCarrinho(id);
        return ResponseEntity.noContent().build();
    }
}

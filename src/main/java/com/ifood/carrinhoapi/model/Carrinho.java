package com.ifood.carrinhoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ifood.carrinhoapi.enumeration.FormaPagamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hiberneteLazyInicializer", "handler"})
@Entity
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrinho")
    private List<Item> itens = new ArrayList<>();

    private Double valorTotal = 0.0;

    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    private boolean fechada;

}

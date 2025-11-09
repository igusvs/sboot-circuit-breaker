package com.resiliencia.padroes.service;

import com.resiliencia.padroes.domain.Produto;

import java.util.List;

public class ProdutoFactory {

    public static List<Produto> criaListaProduto(){

        return List.of(
                new Produto(),
                new Produto(),
                new Produto()

        );
    }


}

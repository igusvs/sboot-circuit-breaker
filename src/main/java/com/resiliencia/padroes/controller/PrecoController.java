package com.resiliencia.padroes.controller;

import com.resiliencia.padroes.domain.Produto;
import com.resiliencia.padroes.domain.ProdutoRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller("/api")
public class PrecoController {


    @GetMapping("/preco/{produtoId}")
    public ResponseEntity<List<ProdutoRecord>> precos(@RequestParam String idProduto){


    return null;

    }

}

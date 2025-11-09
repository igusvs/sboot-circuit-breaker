package com.resiliencia.padroes.controller;

import com.resiliencia.padroes.domain.Produto;
import com.resiliencia.padroes.domain.ProdutoRecord;
import com.resiliencia.padroes.service.PrecoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller("/api")
public class PrecoController {

    private final PrecoService precoService;

    public PrecoController(PrecoService precoService) {
        this.precoService = precoService;
    }

    @GetMapping("/preco/{produtoId}")
    public ResponseEntity<List<ProdutoRecord>> precos(@RequestParam String idProduto){




        return null;

    }

}

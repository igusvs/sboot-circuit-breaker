package com.resiliencia.padroes.client;


import com.resiliencia.padroes.domain.ProdutoSaleRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(
        name = "magaluClient",
        url = "http://localhost:8080",
        configuration = MagaluConfigFeign.class
)
public interface MagaluClient {

    @GetMapping("/magalu/produto")
    public ProdutoSaleRecord obterProduto();

}

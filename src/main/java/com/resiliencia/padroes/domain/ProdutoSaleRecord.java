package com.resiliencia.padroes.domain;

import java.math.BigDecimal;

public record ProdutoSaleRecord(String idProduto, String nomeProduto, BigDecimal produto, String detentor) {
}

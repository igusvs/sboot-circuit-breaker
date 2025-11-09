package com.resiliencia.padroes.domain;

import java.math.BigDecimal;

public record ProdutoRecord(String idProduto, String nome, BigDecimal valor, String detentor) {
}

package com.investimento.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Investimentos {
    private Long id;
    private String nome;
    private TipoInvestimento tipo;
    private BigDecimal valorUnidade;
    private BigDecimal quantidadeAtivo;
    private LocalDate diaCompra;
    private BigDecimal precoMedio;
    private BigDecimal valorTotalInvestido;
}

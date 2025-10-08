package com.investimento.dto;

import com.investimento.model.TipoInvestimento;

import java.math.BigDecimal;
import java.time.LocalDate;

public record InvestimentoRequestDTO(String nome,
                                     String tipo,
                                     BigDecimal valorUnidade,
                                     BigDecimal quantidadeAtivo,
                                     LocalDate diaCompra) {
}

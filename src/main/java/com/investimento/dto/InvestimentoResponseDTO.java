package com.investimento.dto;

import com.investimento.model.Investimentos;
import com.investimento.model.TipoInvestimento;

import java.math.BigDecimal;
import java.time.LocalDate;

public record InvestimentoResponseDTO(Long id,
                                      String nome,
                                      String tipo,
                                      BigDecimal valorUnidade,
                                      BigDecimal quantidadeAtivo,
                                      LocalDate diaCompra) {

    public InvestimentoResponseDTO(Investimentos salvo) {
        this(salvo.getId(), salvo.getNome(),
             salvo.getTipo(), salvo.getValorUnidade(),
             salvo.getQuantidadeAtivo(),salvo.getDiaCompra());
    }
}

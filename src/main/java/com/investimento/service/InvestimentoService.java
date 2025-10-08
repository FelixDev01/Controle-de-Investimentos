package com.investimento.service;

import com.investimento.dto.InvestimentoRequestDTO;
import com.investimento.dto.InvestimentoResponseDTO;
import com.investimento.model.Investimentos;
import com.investimento.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestimentoService {

    @Autowired
    private InvestimentoRepository repository;

    public InvestimentoResponseDTO cadastrar(InvestimentoRequestDTO dto){
        Investimentos investimentos = new Investimentos();
        investimentos.setNome(dto.nome());
        investimentos.setTipo(dto.tipo());
        investimentos.setQuantidadeAtivo(dto.quantidadeAtivo());
        investimentos.setValorUnidade(dto.valorUnidade());
        investimentos.setDiaCompra(dto.diaCompra());
        Investimentos salvo = repository.save(investimentos);

        return new InvestimentoResponseDTO(salvo);
    }
}

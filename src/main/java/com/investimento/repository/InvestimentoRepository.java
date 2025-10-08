package com.investimento.repository;

import com.investimento.model.Investimentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<Investimentos, Long> {
}

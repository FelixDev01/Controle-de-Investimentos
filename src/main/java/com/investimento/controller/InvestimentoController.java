package com.investimento.controller;

import com.investimento.dto.InvestimentoRequestDTO;
import com.investimento.dto.InvestimentoResponseDTO;
import com.investimento.repository.InvestimentoRepository;
import com.investimento.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoService service;

    @PostMapping
    public ResponseEntity<InvestimentoResponseDTO> cadastrar(@RequestBody InvestimentoRequestDTO dto) {
        InvestimentoResponseDTO salvar = service.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvar);
    }

    @GetMapping
    public ResponseEntity<Page<InvestimentoResponseDTO>> listarTodos(@PageableDefault(size = 10, sort = "id") Pageable pageable){
        Page<InvestimentoResponseDTO> listar = service.listarTodos(pageable);
        return ResponseEntity.ok(listar);
    }
}

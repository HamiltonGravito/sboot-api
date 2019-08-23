package com.example.sboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sboot.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}

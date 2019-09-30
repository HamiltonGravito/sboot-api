package com.example.sboot.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.sboot.api.model.Pessoa;
import com.example.sboot.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
		if (pessoaSalva.isPresent()) {
			// Copia as propriedades do Objeto recuperado para o novo objeto que será
			// atuaçlizado no banco ignorando o codigo
			BeanUtils.copyProperties(pessoa, pessoaSalva.get(), "codigo");
			pessoaRepository.save(pessoaSalva.get());
			return pessoaRepository.save(pessoaSalva.get());
		} else {
			throw new EmptyResultDataAccessException(1);
		}
	}
}

package com.example.sboot.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sboot.api.model.Categoria;
import com.example.sboot.api.repository.CategoriaRepository;

//Controlador Rest (Ex.: Retorno em JSON)
@RestController
//Mapeamento da Requisição que responderá na url .../categorias
@RequestMapping("/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaRepository categoriaRepository;

	//Verbo get na url categorias retorna a lista de categorias
	@GetMapping
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
}

package com.example.sboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sboot.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

package com.example.sboot.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
@SequenceGenerator(name="categoria_seq", sequenceName="categoria_seq", initialValue = 1, allocationSize = 1)
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_seq")
	private Long codigo;
	//Aplicação valida se o nome não é nulo antes de chegar ao Banco de Dados
	@NotNull
	@Size(min = 5, max =50)
	private String nome;
	
	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}

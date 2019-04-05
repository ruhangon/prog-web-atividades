package br.unisul.web.atividade1.dtos;

import java.io.Serializable;

import br.unisul.web.atividade1.domain.Disciplina;

public class DisciplinaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private Integer semestre;

	public DisciplinaDto() {
	}

	public DisciplinaDto(Disciplina obj) {
		id = obj.getId();
		nome = obj.getNome();
		semestre = obj.getSemestre();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

}

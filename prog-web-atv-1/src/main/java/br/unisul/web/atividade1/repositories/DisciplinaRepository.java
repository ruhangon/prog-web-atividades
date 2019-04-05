package br.unisul.web.atividade1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.web.atividade1.domain.Aluno;
import br.unisul.web.atividade1.domain.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
	List<Disciplina> findDistinctByNomeContainingAndAlunosIn(String nome, List<Aluno> alunos);

}

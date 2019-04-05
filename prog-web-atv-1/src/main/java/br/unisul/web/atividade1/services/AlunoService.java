package br.unisul.web.atividade1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.web.atividade1.domain.Aluno;
import br.unisul.web.atividade1.repositories.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository rep;

	public Aluno find(Integer id) {
		Optional<Aluno> obj = rep.findById(id);
		return obj.orElse(null);
	}

	public List<Aluno> findAll() {
		return rep.findAll();
	}

}

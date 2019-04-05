package br.unisul.web.atividade1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.web.atividade1.domain.Disciplina;
import br.unisul.web.atividade1.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	@Autowired
	private DisciplinaRepository repDisc;

	public Disciplina find(Integer id) {
		Optional<Disciplina> obj = repDisc.findById(id);
		return obj.orElse(null);
	}

	public List<Disciplina> findAll() {
		return repDisc.findAll();
	}

}

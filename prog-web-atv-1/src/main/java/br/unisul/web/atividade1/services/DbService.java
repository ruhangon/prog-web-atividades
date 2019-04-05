package br.unisul.web.atividade1.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.web.atividade1.domain.Aluno;
import br.unisul.web.atividade1.domain.Disciplina;
import br.unisul.web.atividade1.repositories.AlunoRepository;
import br.unisul.web.atividade1.repositories.DisciplinaRepository;

@Service
public class DbService {
	@Autowired
	private AlunoRepository repAlu;

	@Autowired
	private DisciplinaRepository repDisc;

	public void inicializaBancoDeDados() throws ParseException {
		Aluno alu1 = new Aluno(null, "Ana");
		alu1.getEmails().addAll(Arrays.asList("ana.exemplo1@gmail.com"));
		Aluno alu2 = new Aluno(null, "Juan");
		alu2.getEmails().addAll(Arrays.asList("juan.exemplo1@gmail.com", "juan.exemplo2@gmail.com"));
		Aluno alu3 = new Aluno(null, "Marco");
		alu3.getEmails().addAll(Arrays.asList("marco.exemplo1@gmail.com"));

		Disciplina disc1 = new Disciplina(null, "Integrais", 5);
		Disciplina disc2 = new Disciplina(null, "POO", 3);
		Disciplina disc3 = new Disciplina(null, "Programação para web", 5);

		disc1.getAlunos().addAll(Arrays.asList(alu1, alu2, alu3));
		disc2.getAlunos().addAll(Arrays.asList(alu3));
		disc3.getAlunos().addAll(Arrays.asList(alu1, alu2));

		alu1.getDisciplinas().addAll(Arrays.asList(disc1, disc3));
		alu2.getDisciplinas().addAll(Arrays.asList(disc1, disc3));
		alu3.getDisciplinas().addAll(Arrays.asList(disc1, disc2));

		repAlu.saveAll(Arrays.asList(alu1, alu2, alu3));
		repDisc.saveAll(Arrays.asList(disc1, disc2, disc3));
	}

}

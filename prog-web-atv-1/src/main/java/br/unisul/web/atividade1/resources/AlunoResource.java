package br.unisul.web.atividade1.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.unisul.web.atividade1.domain.Aluno;
import br.unisul.web.atividade1.dtos.AlunoDto;
import br.unisul.web.atividade1.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {
	@Autowired
	private AlunoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Aluno> find(@PathVariable Integer id) {
		Aluno obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<AlunoDto>> findAll() {
		List<Aluno> lista = service.findAll();

		List<AlunoDto> listDto = new ArrayList<AlunoDto>();

		for (Aluno a : lista) {
			listDto.add(new AlunoDto(a));
		}

		return ResponseEntity.ok().body(listDto);
	}

}

package br.unisul.web.atividade1.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.unisul.web.atividade1.domain.Disciplina;
import br.unisul.web.atividade1.dtos.DisciplinaDto;
import br.unisul.web.atividade1.services.DisciplinaService;

@RestController
@RequestMapping(value = "/disciplinas")
public class DisciplinaResource {
	@Autowired
	private DisciplinaService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Disciplina> find(@PathVariable Integer id) {
		Disciplina obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DisciplinaDto>> findAll() {
		List<Disciplina> lista = service.findAll();

		List<DisciplinaDto> listDto = new ArrayList<DisciplinaDto>();

		for (Disciplina d : lista) {
			listDto.add(new DisciplinaDto(d));
		}

		return ResponseEntity.ok().body(listDto);
	}

}

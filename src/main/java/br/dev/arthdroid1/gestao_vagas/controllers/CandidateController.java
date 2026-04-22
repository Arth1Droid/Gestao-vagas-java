package br.dev.arthdroid1.gestao_vagas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.arthdroid1.gestao_vagas.models.Candidate;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	
	@PostMapping("/")
	public void create(@Valid @RequestBody Candidate candidate) {
		System.out.println("Candidate");
		System.out.println(candidate.getEmail());
	}

}

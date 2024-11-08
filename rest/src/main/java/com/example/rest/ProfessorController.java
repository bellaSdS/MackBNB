package com.example.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
class ProfessorController {
	@Autowired
	private ProfessorRepo professorRepo;
	public ProfessorController() {}
	@GetMapping("/api/professores")
	Iterable<Professor> getProfessores() { return professorRepo.findAll(); }
	@GetMapping("/api/professores/{id}")
	Optional<Professor> getProfessor(@PathVariable(required=true, name="id") long id) { return professorRepo.findById(id); }
	@PostMapping("/api/professores")
	Professor createProfessor(@RequestBody Professor p) { return professorRepo.save(p); }
	@PutMapping("/api/professores/{id}")
	Optional<Professor> updateProfessor(@RequestBody Professor professor, @PathVariable(required=true, name="id") long id) {
		Optional<Professor> opt = this.getProfessor(id);
		if (opt.isPresent() && opt.get().getID() == professor.getID()) { 
			return Optional.of(professorRepo.save(professor)); 
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do professor com id " + id);	
	}	
	@DeleteMapping(value = "/api/professores/{id}")
	void deleteProfessor(@PathVariable(required=true, name="id") long id) { professorRepo.deleteById(id); }		
}
package com.iobeica.springmongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iobeica.springmongodb.model.Pessoa;
import com.iobeica.springmongodb.repository.PessoaRepository;

@RestController
@RequestMapping("/api/public/pessoa")
public class PessoaResource {
	
	@Autowired
	PessoaRepository pessoaRepo;
	
	@GetMapping("/hello")
	public ResponseEntity<?> hello(){
		return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
	}
	
	@GetMapping("/findAll")
	public List<Pessoa> findAll(){
		return pessoaRepo.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Pessoa pessoa) {
		pessoaRepo.save(pessoa);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
	}
	
	@DeleteMapping("/deleteAll")
	public ResponseEntity<?> deleteAll(){
		
		pessoaRepo.deleteAll();
		return ResponseEntity.status(HttpStatus.OK).body("Todas as pessoas deletadas!!!");
		
	}
	

}

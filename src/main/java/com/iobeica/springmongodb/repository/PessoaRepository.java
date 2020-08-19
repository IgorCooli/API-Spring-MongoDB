package com.iobeica.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iobeica.springmongodb.model.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String>{
	
	

}

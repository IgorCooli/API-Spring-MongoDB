package com.iobeica.springmongodb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
@Document(collection = "pessoa")
public class Pessoa {
	
	@Id
	private String id;
	private String nome;
	private String sobrenome;
	private String profissao;
	private Endereco endereco;
	private List<Hobby> hobbies;
	
}

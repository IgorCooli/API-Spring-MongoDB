package com.iobeica.springmongodb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class Endereco {

	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento;

}

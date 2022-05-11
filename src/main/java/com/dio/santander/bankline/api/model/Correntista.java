package com.dio.santander.bankline.api.model;

import lombok.Data;

@Data
public class Correntista {
	
	private Integer id;
	private String cpf;
	private String nome;
	
	private Conta conta;

}

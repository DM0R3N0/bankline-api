package com.dio.santander.bankline.api.model;

import lombok.Data;

@Data
public class Conta {
	
	private Integer id;
	private Long numero;
	private Double saldo;

}

package com.projeto.exercicios.enums;

public enum Cor {
	
	BRANCO("Branco"),
	PRETO("Preto");
	
	private String nome;
	
	Cor(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

}

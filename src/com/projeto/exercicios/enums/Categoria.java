package com.projeto.exercicios.enums;

public enum Categoria {
	
	BASICO("Basico"),
	INTERMEDIARIO("Intermediario"),
	EXECUTIVO("Executivo"),
	PREMIUM("Premium");
	
	private String nome;
	
	Categoria(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

}

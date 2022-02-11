package com.projeto.exercicios.enums;

public enum Veiculo {

	FIAT_UNO("Fiat Uno - Modelo way", Motor.MOTOR_1_0, Cor.PRETO, 130.00, Categoria.BASICO),
	VW_GOL("Gol", Motor.MOTOR_1_0, Cor.PRETO, 150.00, Categoria.BASICO),
	JEEP_RENEGATE("Jeep Renegate", Motor.MOTOR_1_8, Cor.BRANCO, 350.00, Categoria.INTERMEDIARIO),
	RENAULT_DUSTER("Renault Duster", Motor.MOTOR_1_6, Cor.PRETO, 350.00, Categoria.INTERMEDIARIO),
	TOYOTA_HILUX("Toyota Hilux", Motor.MOTOR_3_0, Cor.BRANCO, 1500.00, Categoria.EXECUTIVO),
	GM_TRAILBLAZER("GM Trailblazer", Motor.MOTOR_3_0, Cor.PRETO, 1800.00, Categoria.EXECUTIVO),
	PORCHE_CAYENNE("Porche Cayenne", Motor.MOTOR_4_0, Cor.PRETO, 3500.00, Categoria.PREMIUM),
	FORD_MUSTANG("Ford Mustang", Motor.MOTOR_5_0, Cor.BRANCO, 4000.00, Categoria.PREMIUM);

	private String descricao;
	private Motor motor;
	private Cor cor;
	private double preco;
	private Categoria categoria;

	private Veiculo(String descricao, Motor motor, Cor cor, double preco, Categoria categoria) {
		this.descricao = descricao;		
		this.motor = motor;
		this.cor = cor;
		this.preco = preco;
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public Motor getMotor() {
		return motor;
	}

	public Cor getCor() {
		return cor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}

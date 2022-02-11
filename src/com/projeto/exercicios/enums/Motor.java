package com.projeto.exercicios.enums;

public enum Motor {

	MOTOR_1_0("Motor 1.0"),
	MOTOR_1_6("Motor 1.6"),
	MOTOR_1_8("Motor 1.8"),
	MOTOR_3_0("Motor 2.0"),
	MOTOR_4_0("Motor 3.0"),
	MOTOR_5_0("Motor 4.0");
	
	private String nome;
	
	Motor(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}

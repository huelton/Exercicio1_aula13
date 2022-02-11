package com.projeto.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.projeto.exercicios.enums.Veiculo;

public class Cliente {

	private static int count;
	private int id;
	private String nome;
	private int idade;
	private Map<Veiculo, Integer> aluguelDeVeiculos;
	
	Cliente(){
		
	}
	
	
	public Cliente(String nome, int idade) {
		id = ++count;
		this.nome = nome;
		this.idade = idade;
		aluguelDeVeiculos = new HashMap<>();
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public List<Veiculo> veiculosDisponivel() {
		List<Veiculo> listVeiculo = new ArrayList<>();
		for (Veiculo v : Veiculo.values()) {
			if(aluguelDeVeiculos.containsKey(v))
				listVeiculo.add(v);
		}		
		
		return listVeiculo;
	}

	public void setAluguelDeVeiculos(Veiculo veiculo, int dias) {
		aluguelDeVeiculos.put(veiculo, dias);
	}

	@Override
	public String toString() {
		
		double totalAluguel = 0.0;
		String assinaturas = "";
		for(Map.Entry<Veiculo, Integer> contrato : aluguelDeVeiculos.entrySet()) {
			
			assinaturas += "\n - Alugou por "+contrato.getValue()+" dia(s) na Categoria "
					    + contrato.getKey().getCategoria().getNome() + " - " 
			            + "Modelo: "+ contrato.getKey().getDescricao() + " - " 
					    + contrato.getKey().getMotor().getNome() + " - " 
					    + "Cor: "+ contrato.getKey().getCor().getNome() +
					    " com valor: "+ String.format("%.2f", (contrato.getValue() * contrato.getKey().getPreco()));
			
			totalAluguel += (contrato.getValue() * contrato.getKey().getPreco());
		}
		
		return "\nNome: "+ this.nome +
				"\nIdade: "+ this.idade +
				"\nResumo da contratação: "+ assinaturas +
				"\nValor total do aluguel do(a) "+ this.nome +" : "+ String.format("%.2f",totalAluguel) +"\n";

	}
	
	
	

	
}

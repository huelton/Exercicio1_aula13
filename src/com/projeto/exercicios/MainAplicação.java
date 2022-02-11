package com.projeto.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.projeto.exercicios.enums.Veiculo;

public class MainAplicação {

	static Scanner sc = new Scanner(System.in);
	private static List<Cliente> clientes;

	public static void main(String[] args) {

		clientes = new ArrayList<>();
		menu();
	}

	private static String menu() {

		System.out.println("Digite uma opção: " + "\n1 - Cadastrar cliente" + "\n2 - Buscar Cliente " + "\n3 - Sair");

		String valor = sc.nextLine();

		switch (valor) {
		case "1":
			cadastrarCliente(null, null);
			break;
		case "2":
			buscarCliente(null, null);
			break;
		case "3":
			return "";
		default:
			System.out.println("Opção Invalida tente novamente! ");
			return menu();
		}

		return menu();
	}

	private static String cadastrarCliente(String nome, String idade) {
		System.out.println("Informe o nome do Cliente: ");
		nome = sc.nextLine();

		System.out.println("Informe a idade do Cliente: ");
		idade = sc.nextLine();

		clientes.add(new Cliente(nome, Integer.parseInt(idade)));
		System.out.println("Cliente cadastrado com sucesso!! ");
		return "";
	}

	private static String buscarCliente(String id, Cliente cliente) {
		System.out.println("Informe o ID: ");
		id = sc.nextLine();

		for (Cliente cli : clientes) {
			if (cli.getId() == Integer.parseInt(id))
				cliente = cli;
		}

		System.out.println("Olá " + cliente.getNome() + " - ID: " + cliente.getId());
		System.out.println("Escolha uma opção: " + "\n1 - Alugar Veiculo " + "\n2 - Visualizar dados "
				+ "\n3 - Voltar ao Menu anterior");

		String valor = sc.nextLine();

		switch (valor) {
		case "1":
			contratarVeiculos(cliente, null, null);
			break;
		case "2":
			System.out.println(cliente);
			break;
		default:
			System.out.println("Opção Invalida tente novamente! ");
			return buscarCliente(id, cliente);
		}

		return "";

	}

	private static String contratarVeiculos(Cliente cliente, Veiculo veiculo, String dias) {

		String veiculoDisponivel = "";
		Veiculo[] veiculos = Veiculo.values();
		for (int i = 0; i < veiculos.length; i++) {
			veiculoDisponivel += "\nID: " + (i + 1) 
											+ " - Descrição: " + veiculos[i].getDescricao() 
											+ " - Motor: " + veiculos[i].getMotor().getNome() 
											+ " - Cor: " + veiculos[i].getCor().getNome()
											+ " - Preço: " + veiculos[i].getPreco() 
											+ " - Categoria: "	+ veiculos[i].getCategoria().getNome();
		}
		
		System.out.println("\nEscolha o ID do veiculo: "+ veiculoDisponivel);
		String valor = sc.nextLine();
		
		//PEGA A POSIÇÃO DO VEICULO ESPERADO
		veiculo = veiculos[Integer.parseInt(valor)-1];		
		
		System.out.println("\nEscolha a quantidade de dias para alugar: ");
		dias = sc.nextLine();
		
		cliente.setAluguelDeVeiculos(veiculo, Integer.parseInt(dias));
		int indice = clientes.indexOf(cliente);
		clientes.set(indice, cliente);
		
		return "";

	}

}

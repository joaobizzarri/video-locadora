package br.com.fiap.videolocadora.test;

import java.util.Date;
import java.util.Scanner;

import br.com.fiap.videolocadora.model.Cliente;

public class ClienteTest {
	
	// Tela fake
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Flavio Moreni");
		cliente1.setDataNascimento(new Date());
		
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getIniciaisNome());
		
//		cliente1.id = 1;
//		cliente1.nome ="Flávio Eduardo Moreni".toLowerCase();
//		cliente1.cpf = "191";
//		cliente1.cartaoCredito = "4500-1234-1234-1234";
//		cliente1.dataNascimento = new Date();
//		cliente1.idade = 20;
//		cliente1.alugar();
		
		//Tela do Victor
//		System.out.println("Idade: " + cliente1.idade);
		
		String cartaoNumeroReduzido = cliente1.pegarPrimeirosNumerosCartaoCredito();
		System.out.println(cartaoNumeroReduzido);
		
		String nomeFilme = "Estrelas além do tempo";
		boolean foiDevolvido = cliente1.devolver(nomeFilme);
		if ( foiDevolvido == true) {
			System.out.println("Sucesso");
			}else {
				System.out.println("Deu erro");
			}
		
		/*
		Cliente cliente2 = new Cliente();
		cliente2.id = 1;
		cliente2.nome ="Felipe".toUpperCase();
		cliente2.alugar();
		*/
		// System.out.println(cliente1);
		
	}

}

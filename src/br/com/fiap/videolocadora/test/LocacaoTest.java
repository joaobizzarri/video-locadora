package br.com.fiap.videolocadora.test;

import br.com.fiap.videolocadora.model.Cliente;
import br.com.fiap.videolocadora.model.Filme;
import br.com.fiap.videolocadora.model.Locacao;
import br.com.fiap.videolocadora.util.DateUtil;

public class LocacaoTest {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ("Flavio Moreni","298.000.010-29");
		Filme filme = new Filme ("Mãos talentosas",2000,"Alguns Directors");
		
		Locacao locacao = new Locacao();
		locacao.setDataLocacao(DateUtil.stringToDate("19/07/2021"));
		locacao.setDataDevolucao(DateUtil.stringToDate("21/07/2021"));
		locacao.setValorTotal(20.50);
		locacao.setValorDesconto(1.50);
		locacao.setCliente(cliente);
		locacao.setFilme(filme);
		
		System.out.println(locacao);
		
		System.out.println("Programa feito pela FIAP");
		
	}

}

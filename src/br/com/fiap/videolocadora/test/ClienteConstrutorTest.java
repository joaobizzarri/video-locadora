package br.com.fiap.videolocadora.test;

import java.util.Date;

import br.com.fiap.videolocadora.model.Cliente;
import br.com.fiap.videolocadora.util.DateUtil;

public class ClienteConstrutorTest {

	public static void main(String[] args) {
		// digitou todos na tela
		
//		Cliente c1 = new Cliente();
//		c1.setId(1);
//		c1.setNome("Flavio");
//		c1.setCpf("191");
//		c1.setCartaoCredito("9999-9999-9999-9999");
//		c1.setDataNascimento(new Date() );
//		System.out.println(c1);
//		
//		Cliente c2 = new Cliente("Flavio","999");
//		System.out.println(c2);
//		
//		Cliente c3 = new Cliente(3);
//		System.out.println(c3);
		
		Cliente c4 = new Cliente("Antonio Coutinho");
		//c4.setDataNascimento("24/12/1990");
		c4.setDataNascimento(DateUtil.stringToDate("25/12/1990"));
		c4.alugar();
		c4.devolver("Filme");
		System.out.println(c4.getIdade());

	}

}

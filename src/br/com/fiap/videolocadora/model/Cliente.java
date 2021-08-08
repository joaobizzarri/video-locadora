package br.com.fiap.videolocadora.model;

import java.util.Date;

import br.com.fiap.videolocadora.util.DateUtil;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private String cartaoCredito;
	private Date dataNascimento;
	private int idade;
	
	//construtor
	public Cliente() {
		System.out.println("Executando o construtor do cliente");
		
	}
	
	public Cliente(String nome, String cpf) {
		this.nome =  nome;
		this.cpf = cpf;
	}
	
	public Cliente (String nome, String cpf, String cartaoCredito) {
		this.nome =  nome;
		this.cpf = cpf;
		this.cartaoCredito = cartaoCredito;
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente(int id) {
		this.id = id;
	}

	public Cliente(int id, String nome, String cpf, String cartaoCredito, Date dataNascimento, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cartaoCredito = cartaoCredito;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}

	public String getIniciaisNome() {
		// String retorno = pega a primeira letra do nome
		// quebra espaço
		// pega a primeira letra do 2o nome
		return "FM";
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		this.idade = DateUtil.calcularIdade(dataNascimento);
		return idade;
	}

	

	public void alugar() {
		System.out.println("Aluguel do cliente " + nome + " efetuado com sucesso");
	}
	
	public boolean devolver(String filme){
		// consultar se o filme esta mesmo alugado para aquele cliente
		// verificar se o pagamento foi efetuado
		// alterar o status do filme para livre
		// alterar a conta do cliente para sem débito
		System.out.println("Devolvendo " + filme);
		return true;
		}
	
	public String pegarPrimeirosNumerosCartaoCredito () {
		String valor = cartaoCredito.substring(0,4);
		return valor;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cartaoCredito=" + cartaoCredito
				+ ", dataNascimento=" + dataNascimento + ", idade=" + idade + "]";
	}
	
	
	
		
}

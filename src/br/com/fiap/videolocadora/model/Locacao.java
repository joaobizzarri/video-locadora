package br.com.fiap.videolocadora.model;

import java.util.Date;

public class Locacao {

	private int idLocacao;
	private Date dataLocacao;
	private Date dataDevolucao;
	
	private Cliente cliente;
	private Filme filme;
	
	private int quantidade;
	private double valorTotal;
	private double valorDesconto;
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	
	public Locacao(int idLocacao, Date dataLocacao, Date dataDevolucao, Cliente cliente, Filme filme, int quantidade,
			double valorTotal, double valorDesconto) {
		super();
		this.idLocacao = idLocacao;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.cliente = cliente;
		this.filme = filme;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
		this.valorDesconto = valorDesconto;
	}
	
	
	public Locacao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Locacao [idLocacao=" + idLocacao + ", dataLocacao=" + dataLocacao + ", dataDevolucao=" + dataDevolucao
				+ ", cliente=" + cliente + ", filme=" + filme + ", quantidade=" + quantidade + ", valorTotal="
				+ valorTotal + ", valorDesconto=" + valorDesconto + "]";
	}
	
	
	
}

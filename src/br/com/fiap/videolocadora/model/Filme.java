package br.com.fiap.videolocadora.model;

public class Filme {
	
	private int idFilme;
	private String nome;
	private int anoLanšamento;
	private String diretor;
	private String descricao;
	private String genero;
	private String duracaMinutos;
	
	
	
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoLanšamento() {
		return anoLanšamento;
	}
	public void setAnoLanšamento(int anoLanšamento) {
		this.anoLanšamento = anoLanšamento;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracaMinutos() {
		return duracaMinutos;
	}
	public void setDuracaMinutos(String duracaMinutos) {
		this.duracaMinutos = duracaMinutos;
	}
	
	
	public Filme() {
		super();
	}
	public Filme(String nome, int anoLancamento, String diretor) {
		super();
		this.nome = nome;
		this.anoLanšamento = anoLancamento;
		this.diretor = diretor;
	}
	
	@Override
	public String toString() {
		return "Filme [idFilme=" + idFilme + ", nome=" + nome + ", anoLanšamento=" + anoLanšamento + ", diretor="
				+ diretor + ", descricao=" + descricao + ", genero=" + genero + ", duracaMinutos=" + duracaMinutos
				+ "]";
	}
	
	
	
}

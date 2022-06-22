package br.edu.ifsc.produto;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	private int taxaLucro;
	
	public Produto () {
		
	}
	
	
	public Produto(int id, String nome, double preco, int quantidade, int taxaLucro) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade= quantidade;
		this.taxaLucro = taxaLucro;
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getTaxaLucro() {
		return taxaLucro;
	}
	public void setTaxaLucro(int taxaLucro) {
		this.taxaLucro = taxaLucro;
	}
	
	
	public double calcularPrecoVenda() {
		return preco + (preco * taxaLucro / 100);
	}
	

}

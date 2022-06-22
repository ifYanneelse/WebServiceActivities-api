package br.edu.ifsc.curso.calculadorasalario;

public class SalarioLiquido {

	private final String nome;

	private final double salarioBase;
	
	private final int numeroDependentes;


	public String getNome() {
	return nome;
	}

	public double getsalarioBase() {
	return salarioBase;
	}
	
	public int getnumeroDependentes() {
	return numeroDependentes;
	}

	public SalarioLiquido(String nome, double salarioBase, int numeroDependentes) {
	this.nome=nome;
	this.salarioBase=salarioBase;
	this.numeroDependentes=numeroDependentes;
	}
	
}

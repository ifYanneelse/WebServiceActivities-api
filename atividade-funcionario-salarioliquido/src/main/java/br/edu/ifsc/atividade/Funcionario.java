package br.edu.ifsc.atividade;

public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBruto;
	private double inss;
	private double irpf;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int matricula, String nome, double salarioBruto, double inss, double irpf) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.inss = inss;
		this.irpf = irpf;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getInss() {
		return inss;
	}
	public void setInss(double inss) {
		this.inss = inss;
	}
	public double getIrpf() {
		return irpf;
	}
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	
	public double calcularSalarioLiquido() {
		
		//double salarioLiquido = salarioBruto - calcularIrpf() - calcularInss();
		return salarioBruto - calcularIrpf() - calcularInss();
	}
	
	private double calcularIrpf() {
		if (salarioBruto >= 4664.68) {
			return (salarioBruto * 0.275) - 869.36;
		} else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
			return (salarioBruto * 0.225) - 636.13;
		} else if (salarioBruto >= 28826.66 && salarioBruto <= 3751.05) {
			return (salarioBruto * 0.15) - 354.80;
		} else if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
			return (salarioBruto * 0.075) - 142.80;
		} else {
			return 0.0;
		}
	}
	
	private double calcularInss() {
		if (salarioBruto <= 1045.00) {
			return salarioBruto * 0.075;
		} else if (salarioBruto >= 1045.00 && salarioBruto <= 2089.60) {
			return salarioBruto * 0.09;
		} else if (salarioBruto >= 2089.61 && salarioBruto <= 3134.40) {
			return salarioBruto * 0.12;
		} else if (salarioBruto >= 3134.41 && salarioBruto <= 6101.06) {
			return salarioBruto * 0.14;
		} else {
			return 0;
		}
	}
		
	public FuncionarioDTO getFuncionarioDTO() {
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
			this.getSalarioBruto(), this.calcularIrpf(),
			this.calcularInss(), this.calcularSalarioLiquido());
		return funcionarioDTO;
	}

}


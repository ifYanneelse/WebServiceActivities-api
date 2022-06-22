package br.edu.ifsc.atividade;

import java.util.ArrayList;
import java.util.List;


public class FuncionarioDataSource {
	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		listaFuncionarios.add(new Funcionario(100, "Lucas", 2000.0, 4, 1));
		listaFuncionarios.add(new Funcionario(101, "Mateus", 2400.0, 2, 1));
		listaFuncionarios.add(new Funcionario(102, "Margarete", 14000.0, 2, 1));
		listaFuncionarios.add(new Funcionario(103, "luciana", 2600.0, 1, 1));
	}

	public static List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public static void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		FuncionarioDataSource.listaFuncionarios = listaFuncionarios;
	}
	
	public static void add(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}
	
	public static Funcionario getPorMatricula(int matricula) {
		for (Funcionario funcionario: listaFuncionarios) {
			if (funcionario.getMatricula() == matricula) {
				return funcionario;
			}
		}
		return null;
	}
	
	public static Funcionario getPorSalarioBruto(double salarioBruto) {
		for (Funcionario funcionario: listaFuncionarios) {
			if (funcionario.getSalarioBruto() == salarioBruto) {
				return funcionario;
			}
		}
		return null;
	}
	
	
	public static List<FuncionarioDTO> getListaFuncionariosDTO() {
		List<FuncionarioDTO> resultado = new ArrayList<>();
		for (Funcionario funcionario: listaFuncionarios) {
			FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
					funcionario.getSalarioBruto(), 
					funcionario.getIrpf(), 
					funcionario.getInss(), 
					funcionario.calcularSalarioLiquido());
			resultado.add(funcionarioDTO);
		}
		
		return resultado;
	}
	
	public static FuncionarioDTO calcularSalarioLiquidoDTO (double salarioBruto) {
		FuncionarioDTO funcionarioDTO = null;
		for (Funcionario funcionario : listaFuncionarios) {
			if (funcionario.getSalarioBruto() == salarioBruto) {
				funcionarioDTO = new FuncionarioDTO(
						funcionario.getSalarioBruto(), 
						funcionario.getIrpf(), 
						funcionario.getInss(), 
						funcionario.calcularSalarioLiquido());
				return funcionarioDTO;
			}
		}
		
		return funcionarioDTO;
		
	}

	
}

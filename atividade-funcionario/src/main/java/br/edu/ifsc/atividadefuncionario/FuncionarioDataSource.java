package br.edu.ifsc.atividadefuncionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
	
	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		listaFuncionarios.add(new Funcionario(123, "Ana", 1000.0, 2));
		listaFuncionarios.add(new Funcionario(456, "Laura", 1500.0, 3));
		listaFuncionarios.add(new Funcionario(789, "Maria", 1700.0, 4));
		listaFuncionarios.add(new Funcionario(321, "Carla", 1100.0, 5));
	}
	
	public static List<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public static void novo(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}

}
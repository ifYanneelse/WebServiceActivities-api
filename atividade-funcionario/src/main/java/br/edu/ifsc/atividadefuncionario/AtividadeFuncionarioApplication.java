package br.edu.ifsc.atividadefuncionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeFuncionarioApplication {

	public static void main(String[] args) {
		
		FuncionarioDataSource.criarLista();
		
		SpringApplication.run(AtividadeFuncionarioApplication.class, args);
	}

}

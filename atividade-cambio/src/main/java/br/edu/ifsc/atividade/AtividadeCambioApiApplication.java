package br.edu.ifsc.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeCambioApiApplication {

	public static void main(String[] args) {
		
		CambioDataSource.criarLista();
		
		SpringApplication.run(AtividadeCambioApiApplication.class, args);
	}

}

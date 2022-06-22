package br.edu.ifsc.cambio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CambioApiApplication {

	public static void main(String[] args) {
		
		CambioDataSource.criarLista();
		
		SpringApplication.run(CambioApiApplication.class, args);
	}

}

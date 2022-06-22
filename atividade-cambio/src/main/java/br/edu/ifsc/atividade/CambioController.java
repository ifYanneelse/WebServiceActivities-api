package br.edu.ifsc.atividade;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CambioController {


	@RequestMapping(value = "/converter_moeda/{valor}/{tipoMoeda}/{operacao}", method = RequestMethod.GET)
	public double converterMoeda(
			@PathVariable ("valor") double valor,
			@PathVariable ("tipoMoeda") String tipoMoeda,
			@PathVariable ("operacao") String operacao) {
	
		Cambio cambio = new Cambio();
		//double resultado = cambio.escolherOperacao();
		double resultado = cambio.calcularMoeda(valor, tipoMoeda, operacao);
		return resultado;
	      
		}
}

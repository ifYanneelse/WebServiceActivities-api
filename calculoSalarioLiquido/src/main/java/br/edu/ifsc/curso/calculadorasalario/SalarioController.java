package br.edu.ifsc.curso.calculadorasalario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalarioController {

	@RequestMapping(value = "/calcular_salario/{nome}/{salarioBase}/{numeroDependentes}", method = RequestMethod.GET)
	public Double SalarioLiquido(
			@PathVariable("nome") String nome,
			@PathVariable("salarioBase") Double salarioBase,
			@PathVariable("numeroDependentes") int numeroDependentes) {
						
		double irpf;	
		if (salarioBase>=8500){
			irpf = salarioBase - (27.5/100);
			}
		else if (salarioBase>=5000){
			irpf = salarioBase - (15/100);
			} else {
			irpf = 0;
			}
		
		
		double salarioFamilia=numeroDependentes*150;
		
		double salarioLiquido = salarioBase - irpf + salarioFamilia;
		return salarioLiquido;
	}
}

package br.edu.ifsc.atividade;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FuncionarioController {

	@RequestMapping(value = "/listar_funcionarios")
	public List<Funcionario> getFuncionarios() {
		return FuncionarioDataSource.getListaFuncionarios();
	}
	
	@RequestMapping(value = "/funcionarios/{matricula}/{nome}/{salarioBruto}/{inss}/{irpf}")
	public Funcionario novoFuncionario(
			@PathVariable("matricula") int matricula,
			@PathVariable("nome") String nome,
			@PathVariable("salarioBruto") double salarioBruto, 
			@PathVariable("inss") double inss,
			@PathVariable("irpf") double irpf){

		Funcionario funcionario = new Funcionario(matricula, nome, salarioBruto, inss, irpf);
		
		FuncionarioDataSource.add(funcionario);
		
		return funcionario;
	}
	
	@RequestMapping(value = "/funcionario_por_matricula/{matricula}", method = RequestMethod.GET)
	public Funcionario getPorMatricula(
			@PathVariable("matricula") int matricula) {
		return FuncionarioDataSource.getPorMatricula(matricula);
	}
	
	@RequestMapping(value = "/calcular_salarioPorMatricula/{matricula}", method = RequestMethod.GET)
	public double calcularSalarioLiquido(
			@PathVariable("matricula") int matricula) {
		
		Funcionario funcionario = FuncionarioDataSource.getPorMatricula(matricula); 
	    return funcionario.calcularSalarioLiquido(); 
	}
	
	@RequestMapping(value = "/salario_liquido/{salarioBruto}", method = RequestMethod.GET)
	public Funcionario calcularSalarioLiquido(
			@PathVariable("salarioBruto") double salarioBruto) {
	
		//return FuncionarioDataSource.getsalarioBruto(salarioBruto).calcularSalarioLiquido();
		//Funcionario funcionario = FuncionarioDataSource.getPorSalarioBruto(salarioBruto);
	    return FuncionarioDataSource.getPorSalarioBruto(salarioBruto);
	}
	
	@RequestMapping(value = "/funcionario_dto")
	public List<FuncionarioDTO> getFuncionarioDTO() {
		return FuncionarioDataSource.getListaFuncionariosDTO();
	}
	
	@RequestMapping(value = "/salario_liquido_dto/{salarioBruto}")
	public FuncionarioDTO getsalarioLiquidoDTO(
			@PathVariable("salarioBruto") double salarioBruto) {
		return FuncionarioDataSource.calcularSalarioLiquidoDTO(salarioBruto);
	}
	

	}

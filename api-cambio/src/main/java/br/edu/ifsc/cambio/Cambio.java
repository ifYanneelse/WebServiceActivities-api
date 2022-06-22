package br.edu.ifsc.cambio;

public class Cambio {
	
	private String operacao;
	private double valor;
	private String tipoMoeda;
	
	
	
	public Cambio() {
		super();
	}
	

	public Cambio(double dc, double dp, double dx, double dt, double eu, double ou, 
			String operacao, double valor, String tipoMoeda) {
		super();
		this.dc = dc;
		this.dp = dp;
		this.dx = dx;
		this.dt = dt;
		this.eu = eu;
		this.ou = ou;
		this.operacao = operacao;
		this.valor = valor;
		this.tipoMoeda = tipoMoeda;
	}
	
	
	public double getDc() {
		return dc;
	}
	public void setDc(double dc) {
		this.dc = dc;
	}
	public double getDp() {
		return dp;
	}
	public void setDp(double dp) {
		this.dp = dp;
	}
	public double getDx() {
		return dx;
	}
	public void setDx(double dx) {
		this.dx = dx;
	}
	public double getDt() {
		return dt;
	}
	public void setDt(double dt) {
		this.dt = dt;
	}
	public double getEu() {
		return eu;
	}
	public void setEu(double eu) {
		this.eu = eu;
	}
	public double getOu() {
		return ou;
	}
	public void setOu(double ou) {
		this.ou = ou;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValora(double valor) {
		this.valor = valor;
	}
	public String getTipoMoeda() {
		return tipoMoeda;
	}

	public void setTipoMoeda(String tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}
	

	
	public double calcularMoeda(double valor, String tipoMoeda, String operacao)
	{
		if (operacao.equalsIgnoreCase("compra")) {
			return calcularCompra(tipoMoeda);
		} else {
		return calcularVenda();
		}
	}


	private double calcularCompra(String tipoMoeda) {
		if (tipoMoeda.equalsIgnoreCase("dc")) {
			return valor * 5.6061;			
		} else if (tipoMoeda.equalsIgnoreCase("dp")) {
			return valor * 5.69;
		} else if (tipoMoeda.equalsIgnoreCase("dx")) {
			return valor * 5.6058;
		} else if (tipoMoeda.equalsIgnoreCase("dt")) {
			return valor * 5.5430;
		} else if (tipoMoeda.equalsIgnoreCase("eu")) {
			return valor * 6.5630;
		} else if (tipoMoeda.equalsIgnoreCase("ou")) {
			return valor * 346.70;
		} else {
			return 0.0;
		}
	}
	
	private double calcularVenda() {
		if (tipoMoeda.equalsIgnoreCase("dc")) {
			return valor * 5.6066;			
		} else if (tipoMoeda.equalsIgnoreCase("dp")) {
			return valor * 5.79;
		} else if (tipoMoeda.equalsIgnoreCase("dx")) {
			return valor * 5.6064;
		} else if (tipoMoeda.equalsIgnoreCase("dt")) {
			return valor * 5.7530;
		} else if (tipoMoeda.equalsIgnoreCase("eu")) {
			return valor * 6.8070;
		} else if (tipoMoeda.equalsIgnoreCase("ou")) {
			return valor * 0.0188;
		} else {
			return 0.0;
		}
	}


	
}

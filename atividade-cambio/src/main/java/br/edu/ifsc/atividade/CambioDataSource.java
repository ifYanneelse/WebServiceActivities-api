package br.edu.ifsc.atividade;

import java.util.ArrayList;
import java.util.List;

public class CambioDataSource {

	private static List<Cambio> listaMoedas = new ArrayList<>();

	public static void criarLista() {
		listaMoedas.add(new Cambio("Dólar Comercial", "DC", 5.6061, 5.6066));
		listaMoedas.add(new Cambio("Dólar paralelo", "DP", 5.69, 5.79));
		listaMoedas.add(new Cambio("Dólar PTAX", "DX", 5.6058, 5.6064));
		listaMoedas.add(new Cambio("Dólar Turismo", "DT", 5.5430, 5.7530));
		listaMoedas.add(new Cambio("EURO", "EU", 6.5630, 6.8070));
		listaMoedas.add(new Cambio("OURO", "OU", 346.70, 1.88));		
	}

	public static List<Cambio> getAll() {
		return listaMoedas;
	}
	
}

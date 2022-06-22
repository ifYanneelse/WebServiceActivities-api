package br.edu.ifsc.cambio;

import java.util.ArrayList;
import java.util.List;

public class CambioDataSource {
	private static List<Moeda> listaMoedas = new ArrayList<>();

	public static void criarLista() {
		listaMoedas.add(new Moeda("Dólar Comercial", "DC", 5.6061, 5.6066));
		listaMoedas.add(new Moeda("Dólar paralelo", "DP", 5.69, 5.79));
		listaMoedas.add(new Moeda("Dólar Ptax", "DX", 5.6058, 5.6064));
		listaMoedas.add(new Moeda("Dólar Turismo", "DT", 5.5430, 5.7530));
		listaMoedas.add(new Moeda("EURO", "EU", 6.5630, 6.8070));
		listaMoedas.add(new Moeda("OURO", "OU", 346.70, 1.88));		
	}

	public static List<Moeda> getAll() {
		return listaMoedas;
	}
	
	public static Moeda get(String sigla) {
		for (Moeda moeda: listaMoedas) {
			if (moeda.getSigla().equalsIgnoreCase(sigla)) {
			    return moeda;
			}
		}
		return null;
	}

package br.edu.ifsc.produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataSource {
	
	private static List<Produto> listaProdutos = new ArrayList<>();
	
	public static void criarLista() {
		listaProdutos.add(new Produto(1,"Tenis", 120.0, 10, 30));
		listaProdutos.add(new Produto(2,"Sapato", 200.0, 50, 10));
		listaProdutos.add(new Produto(3,"Calça", 125.0, 4, 20));
		listaProdutos.add(new Produto(4,"Casaco", 128.0, 33, 30));
		listaProdutos.add(new Produto(5,"Camiseta", 123.0, 12, 5));
	}
	
	public static List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public static void novo(Produto produto) {
		listaProdutos.add(produto);
	}

}

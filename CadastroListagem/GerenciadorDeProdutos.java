package CadastroListagem;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProdutos {
	private static List<CadastroEListagem> produtos;
	
	public GerenciadorDeProdutos() {
	produtos = new ArrayList<>(); 
	}
public void addProduto(CadastroEListagem produto) {
	produtos.add(produto);
}

public static void listaProdutos() {
    System.out.println("Listagem de Produtos:");
    System.out.printf("%-20s %-20s %-10s %-10s\n", "Nome", "Descrição", "Valor", "Disponível");
    for (CadastroEListagem product : produtos) {
        System.out.printf("%-20s %-20s %-10.2f %-10s\n",
                product.getNomeProd(),
                product.getDescricaoProd(),
                product.getValorProd(),
                product.disponibilidade() ? "Sim" : "Não");
    	}
	}
}

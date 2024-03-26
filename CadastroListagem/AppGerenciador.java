package CadastroListagem;

import java.util.Scanner;

public class AppGerenciador {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GerenciadorDeProdutos gerenciadorDeProdutos = new GerenciadorDeProdutos();	
        
        while(true) {
        	
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = s.nextInt();
            
            switch (escolha) {
            
            case 1:
                s.nextLine();
                System.out.print("Nome do produto: ");
                String nome = s.nextLine();
                System.out.print("Descrição do produto: ");
                String descricao = s.nextLine();
                System.out.print("Valor do produto: ");
                double valor = s.nextDouble();
                System.out.print("Disponível para venda (sim/não): ");
                boolean disponibilidade = s.next().equalsIgnoreCase("sim");
                CadastroEListagem cadastro = new CadastroEListagem();
                cadastro.setDescricaoProd(descricao);
                cadastro.setDisponibilidade(disponibilidade);
                cadastro.setNomeProd(nome);
                cadastro.setValorProd(valor);
                gerenciadorDeProdutos.addProduto(cadastro);
                System.out.println("Produto cadastrado com sucesso!");
                break;
                
            case 2:
            	GerenciadorDeProdutos.listaProdutos();
            	break;
            	
            case 3:
            	System.out.println("Saindo...");
                System.exit(0);
                break;
                
            default:
            	System.out.println("Opção inválida!");
            }
        }
	}
}

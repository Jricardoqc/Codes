package CadastroListagem;

public class CadastroEListagem {
	
	private String nomeProd;
	private String descricaoProd;
	private double valorProd;
	private boolean disponibilidade;

	public CadastroEListagem() {
	
	}
	
	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getDescricaoProd() {
		return descricaoProd;
	}

	public void setDescricaoProd(String descricaoProd) {
		this.descricaoProd = descricaoProd;
	}

	public double getValorProd() {
		return valorProd;
	}

	public void setValorProd(double valorProd) {
		this.valorProd = valorProd;
	}
	
	public boolean disponibilidade() {
		return disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public void add(CadastroEListagem produto) {
		
	}

}

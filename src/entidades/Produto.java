package entidades;

public class Produto {
	
	public String name; 
	public double preco; 
	public int quantidade; 
	 
	public Produto(String name, double preco, int quantidade) {
		this.name = name; 
		this.preco = preco; 
		this.quantidade = quantidade;
	}
	
	public double produtoTotal() {
		
		return preco * quantidade; 
		
	}
	
	public void novaQuantidade(int quantidade) {
		 this.quantidade += quantidade;
	}
	
	
	public void removeQuantidade(int quantidade) {
		this.quantidade -= quantidade; 
	}
	
	
}

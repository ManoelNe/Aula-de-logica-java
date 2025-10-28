package entidades;

public class Loja {
	
	private int codigo; 
	private String nome;
	private double preco;
	private int estoque; 
	
	public Loja( String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
		
	}
	public Loja(String nome,int codigo, double preco, int estoque) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		
		this.estoque = estoque;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void adicionarProdutoEstoque(int adicionarProduto) {
		
		 this.estoque += adicionarProduto;
	}
	
	public void removeProduto(int remover) {
		this.estoque -= remover ; 
	}

}

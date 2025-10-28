package entidades;

public class Conta {
	
	private int numero; 
	private String nome; 
	private double depositoInicial;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;

	}
	
	

	public Conta(int numero, String nome, double depositoInicial) {
		
		this.numero = numero;
		this.nome = nome;
		this.depositoInicial = depositoInicial;
	}



	public int getNumero() {
		return numero;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void deposito( double valor) {
		
		 this.depositoInicial += valor; 
	}
	
	public void saque(double dinheiro) {
		this.depositoInicial -= dinheiro + 5.0;
	}

	
	
	

}


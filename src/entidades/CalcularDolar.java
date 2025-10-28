package entidades;

public class CalcularDolar {

	public static double valorDolar(double preco, double quantity ) {
		double taxa = 6; 
		double valorTotal = preco * quantity ; 
		
		return valorTotal + valorTotal * taxa /100 ;
	}
	
}

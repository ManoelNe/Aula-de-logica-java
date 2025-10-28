package entidades;

public class DadosPessoas {
	
	private double altura;
	private char sexo; 
	
	public DadosPessoas( double altura, char sexo) {
		this.altura = altura;
		this.sexo = sexo;
		
	}
	public char Sexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	} 
	
	
	
}

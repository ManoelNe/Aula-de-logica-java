package entidades;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3; 
	
	public double notaFinal() {
		
		return this.nota1 + this.nota2 + this.nota3; 
		
	}
	
	public double passou() {
		if(notaFinal() > 60) {
			return 0.0;
		}else {
			return 60.0 - notaFinal();
			
		}
	}
	
	 
	
	
}

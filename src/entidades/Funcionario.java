package entidades;

public class Funcionario {

		public String nome; 
		public double salarioBruto; 
		public double taxa; 
		
		public double salarioLiquido() {
			return salarioBruto - taxa; 
		}

		public void aumentoSalario( double porcentagem) {
			
			this.salarioBruto += this.salarioBruto * porcentagem /100;

		}

}

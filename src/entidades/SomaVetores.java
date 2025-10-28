package entidades;

public class SomaVetores {

		private int  numeroA;
		private double  vetorB;

		public SomaVetores(int numeroA) {
			
			this.numeroA = numeroA;
		}
		
		public SomaVetores(double vetorB) {
			
			this.vetorB = vetorB;
		}

		public int getNumeroA() {
			return numeroA;
		}
		
		public void setNumeroA(int numeroA) {
			this.numeroA = numeroA;
		} 
		
		public double getVetorB() {
			return vetorB;
		}
		
		
		public void setVetorB(double vetorB) {
			this.vetorB = vetorB;
		} 
		
}

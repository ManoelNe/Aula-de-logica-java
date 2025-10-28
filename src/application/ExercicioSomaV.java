package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.SomaVetores;

public class ExercicioSomaV {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor: ");
		int N = sc.nextInt();
		
		SomaVetores [] vetA = new SomaVetores[N];
		SomaVetores [] vetB = new SomaVetores[N];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0; i<vetA.length; i++) {
			
			int numeroA = sc.nextInt();
			
			vetA[i] = new SomaVetores(numeroA);
			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0; i<vetB.length; i++) {
			
			double numeroB = sc.nextDouble();
			
			vetB[i] = new SomaVetores(numeroB);
			
		}
		
		
		double[] vetC = new double[vetA.length];
		for(int i=0; i<vetA.length; i++) {
			
		 vetC[i] = vetA[i].getNumeroA() + vetB[i].getVetorB();

			
		}
		System.out.println("VETOR RESULTANTE:  ");
		for (int i = 0; i < vetC.length; i++) {
		    System.out.printf(" %.0f%n", vetC[i]);
		}

		sc.close();
	}

}

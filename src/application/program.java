package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class program {
	
	public static void main(String[] args ) {		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			Pessoa  pessoa = new Pessoa();
			System.out.println("Quantos pessoas serão digitados ?");
			int n = sc.nextInt();			
			pessoa.altura = new double[n];
			pessoa.genero = new String [n];
			for(int i =0; i<n; i++) {
				System.out.printf("Altura %da  pessoa:", i+1);
				pessoa.altura[i] = sc.nextDouble();
				System.out.printf("Genero %da  pessoa:", i+1);
				pessoa.genero[i] = sc.next();
			}
		
		pessoa.maiorMenorAltura();
		pessoa.mediaMulhers();
			
			
			
			
	
	}
}

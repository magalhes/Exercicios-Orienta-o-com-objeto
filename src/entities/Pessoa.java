package entities;

public class Pessoa {

	public String genero [] ;
	public double altura [];
	
	public void maiorMenorAltura() {
		double menor =Integer.MAX_VALUE;
		double maior = 0;
		
		for(int i =0; i<altura.length; i++) {
			if(altura[i] > maior) {
				maior = altura[i];
			} if(altura [i] < menor) {
				menor = altura[i];
			}
		}
		System.out.printf("Maior altura = %.2f%n" , maior);
		System.out.printf("Menor altura =%.2f%n " , menor);
	}
	public void mediaMulhers() {
		int qtdMulheres =0;
		int qtdHomens = 0;
		double alturaFem = 0;
		
		for(int i =0; i<genero.length; i++) {
			if(genero[i].equalsIgnoreCase("f")) {
				qtdMulheres++;
				 alturaFem = alturaFem +  altura[i];
			}
			else {
				qtdHomens ++;
			}
		}
		double totalAlturaMulheres = alturaFem /qtdMulheres;
		System.out.printf("\nMedia das alturas das mulheres = %.2f%n" , totalAlturaMulheres);
		System.out.println("Numero de homens = " + qtdHomens);
	}
	
		
			
}



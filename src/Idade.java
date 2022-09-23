
public class Idade {
	public String name[];
	public int idade[];
	
	public void maiorIdade() {
		int maisVelho= 0;
		int posicao = 0;
		for(int i =0; i<idade.length; i++) {
			if(idade[i] > maisVelho) {
				maisVelho = idade[i];
				posicao = i;
			}
			
		}
		System.out.println("Pessoa mais velha: " + name[posicao] );
	}
}

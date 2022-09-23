import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Idade idade = new Idade();
		idade.name = new String[n];
		idade.idade = new int[n];
		for(int i =0; i<n; i++) {
			System.out.printf("Dados %da pessoa: ", (i+1));
			idade.name[i] = sc.next();
			idade.idade[i] = sc.nextInt();
		}
		idade.maiorIdade();
		
	}

}

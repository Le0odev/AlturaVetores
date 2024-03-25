package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Altura;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()
		Altura[] alturas = new Altura[n];
		
		
		for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados da pessoa " + (i + 1) + ":");
            System.out.println("Nome:");
            String name = sc.nextLine();
            System.out.println("Idade:");
            int idade = Integer.parseInt(sc.nextLine()); // Usar nextLine() e converter para int
            System.out.println("Altura:");
            double altura = Double.parseDouble(sc.nextLine()); // Usar nextLine() e converter para double

            alturas[i] = new Altura(name, idade, altura);
        }
	
			
			
			double mediaAlturas = Altura.calcularMediaAltura(alturas);
			System.out.println("Média de altura:" + mediaAlturas);
			
			double percentualMenor = Altura.calcularPercentualMenores(alturas);
			System.out.printf("Percentual de pessoas menores de 16 anos: %.2f%%%n", percentualMenor);
			
			ArrayList<String> pessoasMenor = Altura.listarNomesMenores(alturas);
			System.out.println(pessoasMenor);
			
		
		
		sc.close();
	}

}

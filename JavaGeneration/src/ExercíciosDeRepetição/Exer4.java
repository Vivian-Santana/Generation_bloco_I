package ExercíciosDeRepetição;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int idade, sexo, sentimento, contador = 0, totalCalmoMenor18 = 0, totalNervosaMaior40 = 0, totalCalma = 0,
				totalMulherNervosa = 0, totalHomemAgressivo = 0, totalOutroCalmo = 0;

		while (contador < 150) {

			System.out.print("\nDigite sua idade: ");
			idade = sc.nextInt();

			System.out.print("Digite seu Sexo:\n [1] para feminino \n [2] para masculino \n [3] para Outros: ");
			sexo = sc.nextInt();

			System.out.print
					("Se voce se considera...\n [1] para calmo(a) \n [2] para Nervoso(a) \n [3] para Agressivo(a):");
			sentimento = sc.nextInt();

			if (sentimento == 1) {
				totalCalma++;
			}

			if (sexo == 1 && sentimento == 2) {
				totalMulherNervosa++;
			}

			if (sexo == 2 && sentimento == 3) {
				totalHomemAgressivo++;
			}

			if (sexo == 3 && sentimento == 1) {
				totalOutroCalmo++;
			}
			
			if (idade > 40 && sentimento == 2) {
				totalNervosaMaior40++;
			}
			
			if (idade < 18 && sentimento == 1) {
				totalCalmoMenor18++;
			}

			contador++;
		}
		
		System.out.println("\nO número de pessoas calmas: " + totalCalma);
		System.out.println("O número de mulheres nervosas: " + totalMulherNervosa);
		System.out.println("O número de homens agressivos: " + totalHomemAgressivo);
		System.out.println("O número de outros calmos: " + totalOutroCalmo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + totalNervosaMaior40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + totalCalmoMenor18);
	}

}

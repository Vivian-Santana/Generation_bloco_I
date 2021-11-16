package exercíciosDeRepetição;

import java.util.Scanner;

public class Exer3 {
		public static void main(String[] args) {
		System.out.println();
		Scanner ler = new Scanner(System.in);
		int idade=0, totalMenor21 = 0, totalMaior50 =0;
		
		while(idade!= -99) {
			System.out.println("Digite sua idade:");
			idade = ler.nextInt();
			
			if(idade<21 && idade >=0) {
				totalMenor21++;
			}else if (idade>50) {
				totalMaior50++;
			}
		}
		System.out.println("O total de pessoas menores de 21 é:" + totalMenor21);
		System.out.println("O total de pessoas maiores de 50 é:" + totalMaior50);
 }
}

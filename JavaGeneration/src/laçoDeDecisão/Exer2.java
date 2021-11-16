package laçoDeDecisão;

import java.util.Scanner;
//Faça um programa que entre com três números e coloque em ordem crescente.
public class Exer2 {
	public static void main(String[] args) 
	{
		System.out.println();
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite um número:");
		a= ler.nextInt();
		System.out.println("Digite outro número:");
		b= ler.nextInt();
		System.out.println("Digite mais um número:");
		c= ler.nextInt();
		
		if(a<b) {
			if(b<c) {
				System.out.println(a+"\n"+b+"\n"+c);
			}
			else if(a<c) {
				System.out.println(a+"\n"+c+"\n"+b);
			}else {
				System.out.println(c+"\n"+a+"\n"+b);
			}
		}
		else if (b<c) {
			if (a<c) {
				System.out.println(b+"\n"+a+"\n"+c);
			} else {
				System.out.println(b+"\n"+c+"\n"+a);
			}
		} else {
			System.out.println(c+"\n"+b+"\n"+a);
		}
	}
}

package introdu��oAjava;

import java.util.Scanner;

public class Exer3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
	
		int horas, minutos, segundos, segundosRestantes;
		
		System.out.println("Digite os segundos de dura��o:");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		System.out.println("A dura��o em horas �:" + horas);
		
	    minutos = segundos%360/60;
	    System.out.println("A dura��o em minutos �:" + minutos);
	    
	    segundosRestantes = segundos% 3600/60;
		System.out.println("A dur��o em segundos �:" + segundosRestantes);
	}

}

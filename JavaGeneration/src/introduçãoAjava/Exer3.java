package introduçãoAjava;

import java.util.Scanner;

public class Exer3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
	
		int horas, minutos, segundos, segundosRestantes;
		
		System.out.println("Digite os segundos de duração:");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		System.out.println("A duração em horas é:" + horas);
		
	    minutos = segundos%360/60;
	    System.out.println("A duração em minutos é:" + minutos);
	    
	    segundosRestantes = segundos% 3600/60;
		System.out.println("A durção em segundos é:" + segundosRestantes);
	}

}

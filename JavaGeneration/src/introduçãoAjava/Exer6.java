package introduçãoAjava;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		double x1, x2, y1, y2, d = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas do ponto de partida:");
		x1= ler.nextDouble();
		x2= ler.nextDouble();
		
		System.out.println("Digite as coordenadas do ponto de destino:");
		y1= ler.nextDouble();
		y2= ler.nextDouble();
		
		d = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
		System.out.println("A distancia entre as coordenadas é de:" + d );
	}
}

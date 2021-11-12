package introduçãoAjava;

import java.util.Scanner;

public class Exer7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;
		
		System.out.println("Digite os valores de a até f:");
		a = ler.nextFloat();
		b = ler.nextFloat();
		c = ler.nextFloat();
		d = ler.nextFloat();
		e = ler.nextFloat();
		f = ler.nextFloat();
		
		x=(c*e)-(b*f)/(a*e)-(b*d);
		y= (a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.print("Os valores de x e y são:");
		System.out.print(x);
		System.out.print(y);
		
	}
}

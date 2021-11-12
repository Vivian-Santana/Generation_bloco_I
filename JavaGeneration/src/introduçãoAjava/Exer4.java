package introduçãoAjava;

import java.util.Scanner;

public class Exer4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		double d = 0;
		double r = 0;
		double s = 0;
		System.out.println("Digite tres valores:");
		
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		r= Math.sqrt (a+b);
		s= Math.sqrt(b+c);
		d= (r+s)/2;
		
		System.out.println("A raiz quadrada do número é:");	
		System.out.println(d);
	}

}

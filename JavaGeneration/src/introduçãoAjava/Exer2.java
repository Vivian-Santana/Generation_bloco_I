package introdu��oAjava;

	import java.util.Scanner;

	public class Exer2 {
		public static void main(String args[])
		{
			Scanner ler = new Scanner(System.in);
			int dias, resp, resp2, resp3;
			
			System.out.println("Qual � a sua idade em dias?");
			dias = ler.nextInt();
			
			resp = dias/365; 
			System.out.println("Sua idade em anos �:" + resp);
			
			resp2= dias%365/30;
			System.out.println("Sua idade em meses �:" + resp2);
			
			resp3 = resp2%30 ;
			System.out.println("Sua idade em dias �:" + resp3);
		}

	}

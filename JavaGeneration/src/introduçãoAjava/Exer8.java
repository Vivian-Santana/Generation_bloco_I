package introduçãoAjava;

import java.util.Scanner;

public class Exer8 {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		float custoDeFabrica = 0, custoAoConsumidor, porcentagemDistribuidor=(float) 0.28, imposto= (float) 0.45, somaDistribuidor, somaImposto;
		
		System.out.printf("Digite o custo de fábrica do carro:", custoDeFabrica);
		
		custoDeFabrica = ler.nextFloat();
		somaDistribuidor= custoDeFabrica*porcentagemDistribuidor;
		somaImposto= custoDeFabrica*imposto;
		custoAoConsumidor= custoDeFabrica + somaDistribuidor +somaImposto;
		System.out.printf("Csuto ao consumidor é:" + custoAoConsumidor);
	}
}

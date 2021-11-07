programa
{
	
	funcao inicio()
	{ 
		real p,E,m
		escreva ("Peso:")
		leia (p)
		se(p>50)
	{
		E=p-50
		m=E*4	
		escreva("\nPeso a mais:", E, "\nMulta:R$", m)
	}
		senao
		{
		E=0.00
		m=0.00
		}
		escreva("\nPeso a mais=0;")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
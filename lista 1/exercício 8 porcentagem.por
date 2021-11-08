programa
{
	inclua biblioteca Teclado --> t
	
	funcao inicio()
	{
		real custofab, custocons, dist, imp, somadist, somaimp
		escreva("Custo de fabrica do carro:")
		leia(custofab)
		limpa()
		
		dist=0.28
		imp=0.45

		somadist= custofab*dist
		somaimp= custofab*imp
		custocons=custofab+somadist+somaimp
		escreva("\nCusto de fabrica é:", custofab,"\nCusto para o consumidor é:", custocons,"R$")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
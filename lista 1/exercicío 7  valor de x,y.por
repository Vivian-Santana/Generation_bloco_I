
/* CLIQUE NO SINAL DE "+", À ESQUERDA, PARA EXIBIR A DESCRIÇÃO DO EXEMPLO
 *  
 * Copyright (C) 2014 - UNIVALI - Universidade do Vale do Itajaí
 * 
 * Este arquivo de código fonte é livre para utilização, cópia e/ou modificação
 * desde que este cabeçalho, contendo os direitos autorais e a descrição do programa, 
 * seja mantido.
 * 
 * Se tiver dificuldade em compreender este exemplo, acesse as vídeoaulas do Portugol 
 * Studio para auxiliá-lo:
 * 
 * https://www.youtube.com/watch?v=K02TnB3IGnQ&list=PLb9yvNDCid3jQAEbNoPHtPR0SWwmRSM-t
 * 
 * Descrição:
 * 
 * 	Este exemplo pede ao usuario que informe dois números. Logo após, 
 * 	calcula e exibe:
 * 	
 * 		a) A soma entre os números
 * 		b) A subtração entre os números
 * 		c) A multiplicação entre os números
 * 		d) A divisão entre os números
 * 
 * Autores:
 * 
 * 	Giordana Maria da Costa Valle
 * 	Carlos Alexandre Krueger
 * 	
 * Data: 01/06/2013
 */
 
programa
{
	funcao inicio()
	{
		inteiro8
		x, y,a,b,c,d,E,f, aE, af, bd, bf, cE, cd, ax, dx, by, ey, sub1, sub2, sub3, sub4
		
		escreva("Digite o primeiro coeficiente: ")
		leia(a)
		escreva("Digite o segundo coeficiente: ")
		leia(b)
		escreva("Digite o terceiro coeficiente: ")
		leia(c)
		escreva("Digite o quarto coeficiente: ")
		leia(d)
		escreva("Digite o quinto coeficiente: ")
		leia(E)
		escreva("Digite o sexto coeficiente: ")
		leia(f) 
		
		leia(ax)
		leia(by)
		c=ax+by

		leia(dx)
		leia(ey)
		f=dx+ey 
		
		aE=a*E
		af=a*f
		bd=b*d
		bf=b*f
		cE=c*E
		cd=c*d

		sub1=cE-bf
		sub2=aE-bd
		x=sub1/sub2
		
		sub3=af-cd
		sub4=aE-bd
		y=sub3/sub4

		escreva("\nx é igual a:", x) 
		escreva("\ny é igual a ", y) 		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1496; 
 * @DOBRAMENTO-CODIGO = [1];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
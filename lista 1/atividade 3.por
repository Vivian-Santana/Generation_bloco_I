programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{ inteiro segundos,minutos,horas,resp
	escreva ("Segundos de duração:")
	leia (resp)
	horas=resp/3600
	escreva ("\nA duração em horas é:", horas)
	minutos=resp%3600
	minutos=minutos/60
	segundos=resp%3600
	segundos=segundos%60
	escreva ("\nduracão em minutos é:", minutos)
	escreva ("\nduração em segundos é:",segundos)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
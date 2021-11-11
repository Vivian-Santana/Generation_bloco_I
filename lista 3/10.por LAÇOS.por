programa
{
	
	funcao inicio()
	{
	real sal,fil,somasal=0.0, maiorsal=0.0, somafil=0.0, salcem=0.0, persal=0.0,medsal,medfil
	
		para(inteiro x=1; x<20;x++)
		{
			escreva("digite o",x,"valor do salario")
			leia (sal)
			se(sal>maiorsal)
			{
				maiorsal=sal
			}
			se(sal<=100)
			{
				
				salcem++
			}
			somasal=somasal+sal
			escreva("\nDigite a".,x,"numero de filhos")
			leia(fil)
			somafil=somafil+fil
			limpa()
			
		}
		medsal=somasl/20
		medfil=somafil/20
		persal=100*salcem/20
		escreva("a media salarial é:, medsal,"\nMedia do numero de filhos é:", medfil)
		esceva("\nA porcentagem de pessoas que ganham até 100 é:", persal,"%")
		escreva("\nSalario maior é:",maiorsal)
		escreva("Olá Mundo")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
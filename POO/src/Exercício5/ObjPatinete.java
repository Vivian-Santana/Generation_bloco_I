package Exercício5;

public class ObjPatinete {
	public static void main(String[] args) {
		Patinete p1 = new Patinete();
		
		p1.cor= "Preto";
		p1.marca = "DM Toys";
		p1.tamanho = "adulto";
		
		System.out.println("Descrição do patinete:\n"+ p1.cor+ "\n"+ p1.tamanho +"\n" +"marca:\t" +p1.marca);
	}
}

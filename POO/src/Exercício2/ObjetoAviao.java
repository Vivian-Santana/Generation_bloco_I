package Exercício2;

public class ObjetoAviao {
	public static void main(String[] args) {
		Aviao A1 = new Aviao();
		
		A1.tamanho= "GrandePorte";
		A1.modelo= "Boeing";
		A1.companiaAerea= "Azul";
		A1.voando= true;
		
			if (A1.voando==true) {
				System.out.println("Você perdeu o vôo!");
			}
			else
			{
				System.out.println("Espere no portão de embarque");
			}
		
	}
}

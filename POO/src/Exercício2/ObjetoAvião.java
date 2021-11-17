package Exercício2;

public class ObjetoAvião {
	public static void main(String[] args) {
		Avião A1 = new Avião();
		
		A1.tamanho= "GrandePorte";
		A1.modelo= "Boeing";
		A1.companiaAerea= "Azul";
		A1.voando= true;
		
			if (this.voando==true) {
				System.out.println("Você pedeu o vôo!");
			}
			else
			{
				System.out.println("Espere no portão de embarque");
			}
		
	}
}

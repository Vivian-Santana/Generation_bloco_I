package Exerc�cio2;

public class ObjetoAvi�o {
	public static void main(String[] args) {
		Avi�o A1 = new Avi�o();
		
		A1.tamanho= "GrandePorte";
		A1.modelo= "Boeing";
		A1.companiaAerea= "Azul";
		A1.voando= true;
		
			if (this.voando==true) {
				System.out.println("Voc� pedeu o v�o!");
			}
			else
			{
				System.out.println("Espere no port�o de embarque");
			}
		
	}
}

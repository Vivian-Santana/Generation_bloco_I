package Exercício7;

public class ObjPaciente {
		public static void main(String[] args) {
			
			Paciente p1 = new Paciente();
			
			p1.nomeCompleto= "Elisa Soares Magalhães";
			p1.endereço= "R das Bandeiras 305";
			p1.telefone= "01101010101";
			p1.sintomas= "fortes dores abdominais";
			p1.idade= 22;
			
			System.out.println("Prontuário:\n"+p1.nomeCompleto+ "\nEndereço:"+p1.endereço+ "\ntelefone:"+ p1.telefone+"\nidade:"+p1.idade+"\nsintomas:"+p1.sintomas);
		}
}

package ExercicioHerançaPolimorfismo;

public class Preguiça extends Animal{
	
	public void emitirSom() {
		System.out.println("haraaaa, haaa...");
	}
	public void come() {
		this.comendoBrotosEfolhas();
	}
	public void comendoBrotosEfolhas() {
		System.out.println("Preguiça"+ this.getNome()+"comendo brotos e folhas");
	}
}

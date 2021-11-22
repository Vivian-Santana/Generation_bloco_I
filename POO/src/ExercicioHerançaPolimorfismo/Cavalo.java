package ExercicioHerançaPolimorfismo;

public class Cavalo extends Animal {

	public void emitirSom() {
		System.out.println("iiirrrrí, rilinchin...");
	}
	public void come() {
		this.comendoCapim();
	}
	public void comendoCapim() {
		System.out.println("Cavalo"+ this.getNome()+ "Comendo capim");
	}
}

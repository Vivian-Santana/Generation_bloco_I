package ExercicioHeran�aPolimorfismo;

public class Pregui�a extends Animal{
	
	public void emitirSom() {
		System.out.println("haraaaa, haaa...");
	}
	public void come() {
		this.comendoBrotosEfolhas();
	}
	public void comendoBrotosEfolhas() {
		System.out.println("Pregui�a"+ this.getNome()+"comendo brotos e folhas");
	}
}

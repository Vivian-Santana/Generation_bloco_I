package ExercicioHeran�aPolimorfismo;

public class Main {
	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		
		c1.setNome("\tOreo\n");
		c1.setIdade(3);
		
		c1.emitirSom();
		c1.come();
		
		System.out.println("\n");
		
		Cavalo c2 = new Cavalo();
		c2.setNome("\tP�-de-pano\n");
		c2.setIdade(5);
		
		c2.emitirSom();
		c2.come();
		
		System.out.println("\n");
		
		Pregui�a p1 = new Pregui�a();
		p1.setNome("\tlazy\n");
		p1.setIdade(8);
		
		p1.emitirSom();
		p1.come();
	}
}

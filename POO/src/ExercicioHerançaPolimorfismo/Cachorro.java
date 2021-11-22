package ExercicioHerançaPolimorfismo;

public class Cachorro extends Animal{

		public void emitirSom() {
			System.out.println("au, au, au...");
		}
		public void come(){
			this.petisco();
		}
		public void petisco() {
			System.out.println("cachorro"+ this.getNome()+ "Comendo petisco");
		}
}

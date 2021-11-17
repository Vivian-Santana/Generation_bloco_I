package Exercício1;

public class ObjetoCliente {
		
	public static void main(String[] args) {
		
		Cliente c1  = new Cliente();
		
		c1.setNome("Monare");
		c1.setNomeMeio("Duarte");
		c1.setSobrenome("Amaral");
		
		System.out.println("Nome completo do(a) cliente:\n" + c1.getNome()+"\t"+c1.getNomeMeio()+"\t"+c1.getSobrenome());
	}
}

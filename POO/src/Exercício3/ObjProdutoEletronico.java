package Exerc�cio3;

public class ObjProdutoEletronico {

	public void main(String[] args) {
		
		ProdutoEletronico p1 = new ProdutoEletronico();
		
		p1.finalidade= "ouvir m�sica";
		p1.fonteDeEnergia = "pinhas";
		p1.valor= 0;
		
			if (p1.valor<=50) {
				System.out.println("Compensa comprar");
			}
			else
			{
				System.out.println("Negocio o pre�o");
			}
	}
}

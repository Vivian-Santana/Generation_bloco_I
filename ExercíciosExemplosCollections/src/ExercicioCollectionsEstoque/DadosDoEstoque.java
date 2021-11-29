package ExercicioCollectionsEstoque;

import java.util.ArrayList;

public class DadosDoEstoque {
	public static void main(String[] args) {
		String estoque1 = "vestidos";
		String estoque2 = "blusas";
		String estoque3 = "calças";
		String estoque4 = "shorts";
		String estoque5 = "saias";

		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		estoque.add(estoque5);

		System.out.println(estoque);// REMOVENDO UMA ITEM DA LISTA (SHORTS) QUE ESTÁ NA POSIÇÃO 3
		estoque.remove(3);
		System.out.println(estoque);

		System.out.println("-------------------------------------------------");

		for (String roupas : estoque) {
			System.out.println("Itens do estoque:" + roupas); // TIRANDO OS CONCHETES DOS ITENS
		}

		System.out.println("-------------------------------------------------");

		estoque.add(estoque4); // ADICIONANDO O INTEM "SHORTS" NOVAMENTE
		System.out.println("Item adicionado ao estoque:" + estoque4);
		
		System.out.println("-------------------------------------------------");

		estoque.forEach(roupas -> {
			
			System.out.println("percorrendo:" + estoque);
		});
	}
}

package Exercício4;

public class ObjFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nomeCompleto = "José Da Silva ";
		f1.Cargo = "gerente";
		f1.cargaHorariaDiaria =8;
		f1.salario= (float) 5.570;
		
		System.out.println("Funionário:"+ f1.nomeCompleto + "\nCargo:" + f1.Cargo + "\nCarga horáia/dia:" + f1.cargaHorariaDiaria +"\thoras" + "\nsalário:" +f1.salario);
	}

}

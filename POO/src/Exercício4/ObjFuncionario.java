package Exerc�cio4;

public class ObjFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nomeCompleto = "Jos� Da Silva ";
		f1.Cargo = "gerente";
		f1.cargaHorariaDiaria =8;
		f1.salario= (float) 5.570;
		
		System.out.println("Funion�rio:"+ f1.nomeCompleto + "\nCargo:" + f1.Cargo + "\nCarga hor�ia/dia:" + f1.cargaHorariaDiaria +"\thoras" + "\nsal�rio:" +f1.salario);
	}

}

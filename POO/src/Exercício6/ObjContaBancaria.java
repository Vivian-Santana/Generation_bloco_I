package Exercício6;

public class ObjContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNomeCompleto("Ana Maria Braga");
		conta1.setAgencia("212");
		conta1.setConta ("13316");
		conta1.setCPF("000000000000");
		
		System.out.println("Dados da conta:\n"+ conta1.getConta()+ "\nAgência:"+conta1.getAgencia()+
				"\nConta:"+ conta1.getConta()+ "\nCPF:"+conta1.getCPF());
	}

}
package Exercício6;

class ContaBancaria {
	
	private String nomeCompleto;
	private int Agencia;
	private int conta;
	private int CPF;
	public int getAgencia() 
	
	{
		return Agencia;
	}
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
}

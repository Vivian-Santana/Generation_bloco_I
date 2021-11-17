package Exercício1;

public class Cliente {
	private String nome;
	private String nomeMeio;
	private String sobrenome;
	
	public String getNomeCompleto() {
		String nomeCompleto = getNome() + " " + getNomeMeio()+ " "+ getSobrenome();
		return nomeCompleto;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMeio() {
		return nomeMeio;
	}
	public void setNomeMeio(String nomeMeio) {
		this.nomeMeio = nomeMeio;
	}
	
}

package ExemplosDeCollections;

public class Aluno {

	private String nome;
	private String curso;
	double nota;
	
	public Aluno(String nome, String curso, double nota)
	{
		
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	public String getCurso() {
		return curso;
	}
	public String getNome() {
		return nome;
	}
	public double getNota() {
		return nota;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String toString()
	{
		return this.nome;
	}

}

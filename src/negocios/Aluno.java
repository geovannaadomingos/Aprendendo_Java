package negocios;

public class Aluno extends Pessoa {
	Curso curso;
	
	public Aluno() {
		this.curso = null;
	}

	public Aluno(String nome, String cpf, int idade, Curso curso) {
		super(nome, cpf, idade);
		this.curso = curso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return super.toString()+" / "+"nome do curso:"+ curso.getNome()+" / "+"codigo do curso:"+ curso.getCodigo();
	}
}

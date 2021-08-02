package negocios;

public class Pessoa {
	private String nome, cpf;
	private int idade;
	
	public Pessoa() {
        this.nome = null;
        this.cpf = null;
        this.idade = 0;
    }
	
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString(){
		return "nome:"+nome+" / "+"cpf:"+cpf+" / "+"idade:"+idade;
	}
}

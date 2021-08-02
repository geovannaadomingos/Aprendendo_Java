package dados;

import java.util.Arrays;
import negocios.Pessoa;
import negocios.RepositorioPessoas;

public class RepositorioPessoasArray implements RepositorioPessoas {
	int indice;
	private Pessoa pessoas[];
	
	public RepositorioPessoasArray(int indice) {
		this.indice = 0;
		this.pessoas = new Pessoa[indice];
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
	public void inserir(Pessoa pessoa) {
		pessoas[indice] = pessoa;
		this.indice = this.indice+1;
	}
	public void procurar(String cpf) {
		for(int i=0; i<indice; i++) {
			
			Pessoa pessoa = this.pessoas[i];
			
			if(pessoa.getCpf().equals(cpf)) {
				System.out.println("Nome: "+ pessoa.getNome()+ " / CPF: "+ pessoa.getCpf()+ " /Idade: "+ pessoa.getIdade());
			}
		}
	}
	public void remover(String cpf) {
		for(int i=0; i<indice; i++) {
			Pessoa pessoa = this.pessoas[i];
			if(pessoa.getCpf().equals(cpf)) {
				this.pessoas[i] = this.pessoas[indice-1];
				this.pessoas[indice-1]= null;
				indice = indice -1;
			}
		}
	}
	@Override
	public String toString() {
		return "RepositorioPessoasArray [indice=" + indice + ", pessoas=" + Arrays.toString(pessoas) + "]";
	}
	

}

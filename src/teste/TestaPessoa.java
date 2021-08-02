package teste;
import negocios.Pessoa;
import negocios.Professor;
import negocios.Aluno;
import negocios.Curso;
import negocios.RepositorioPessoas;
import dados.RepositorioPessoasArray;

public class TestaPessoa {

	public static void main(String[] args) {
		Curso curso1 = new Curso(1, "Academia Java");
		Curso curso2 = new Curso(2, "Academia Testes");
		
		Pessoa aluno1 = new Aluno("Marina", "019091019-10", 17, curso1);
		Pessoa aluno2 = new Aluno("Geovanna", "412982989-10", 16, curso2);
		
		Pessoa professor1 = new Professor("Judite", "5019091019-10", 22, 100.77);
		Pessoa professor2 = new Professor("Afonso", "701299989-10", 30,  300.80);
		
		RepositorioPessoas pessoasArray = new RepositorioPessoasArray(4);
		pessoasArray.inserir(aluno1);
		pessoasArray.inserir(aluno2);
		pessoasArray.inserir(professor1);
		pessoasArray.inserir(professor2);
		
		/*
		 * for(int i=0; i<pessoasArray.getIndice(); i++) { Pessoa pessoa =
		 * pessoasArray.getPessoas()[i]; System.out.println("Nome: "+ pessoa.getNome()+
		 * " / CPF: "+ pessoa.getCpf()+ " /Idade: "+ pessoa.getIdade()); }
		 * pessoasArray.remover("412982989-10");
		 * 
		 * System.out.println(pessoasArray.getIndice());
		 * 
		 * for(int i=0; i<pessoasArray.getIndice(); i++) { Pessoa pessoa =
		 * pessoasArray.getPessoas()[i]; System.out.println("Nome: "+ pessoa.getNome()+
		 * " / CPF: "+ pessoa.getCpf()+ " /Idade: "+ pessoa.getIdade()); }
		 */
		
		for(int i=0; i<pessoasArray.getIndice(); i++) {
			Pessoa pessoa = pessoasArray.getPessoas()[i]; 
			System.out.println(pessoa.toString());
		}
		
	}

}

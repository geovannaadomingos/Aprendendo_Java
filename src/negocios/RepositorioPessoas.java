package negocios;

public interface RepositorioPessoas {
	
	void inserir(Pessoa pessoa);
	void procurar(String cpf);
	void remover(String cpf);
	int getIndice();
	Pessoa[] getPessoas();

}
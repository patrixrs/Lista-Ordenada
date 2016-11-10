/**
 * @author Patrick Fraga Ribeiro
 * @email patrix.pfr@gmail.com
 * 
 * Exerc�cio da aula 20/10/2016
 **/

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "[ Nome: " + nome + "	Idade: " + idade + " ]";
	}
}
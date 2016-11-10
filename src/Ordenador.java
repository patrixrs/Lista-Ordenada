
/**
 * @author Patrick Fraga Ribeiro
 * @email patrix.pfr@gmail.com
 * 
 * Exercício da aula 20/10/2016
 **/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenador {

	public static void main(String[] args) {

		List<Pessoa> pessoa = new ArrayList<Pessoa>();

		pessoa.add(new Pessoa("João", 25));
		pessoa.add(new Pessoa("Afonso", 36));
		pessoa.add(new Pessoa("Maria", 12));
		pessoa.add(new Pessoa("Letícia", 9));
		pessoa.add(new Pessoa("Roger", 48));

		System.out.println("Pessoas desordenadas");
		for (Pessoa p : pessoa) {
			System.out.println(p);
		}

		System.out.println("\nOrdenando por nome:");
		Collections.sort(pessoa, new OrdenaNome());
		for (Pessoa p : pessoa) {
			System.out.println(p);
		}

		System.out.println("\nOrdenando por idade:");
		Collections.sort(pessoa, new OrdenaIdade());
		for (Pessoa p : pessoa) {
			System.out.println(p);
		}
	}
}

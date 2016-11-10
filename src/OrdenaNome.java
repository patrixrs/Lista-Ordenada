
/**
 * @author Patrick Fraga Ribeiro
 * @email patrix.pfr@gmail.com
 * 
 * Exercício da aula 20/10/2016
 **/

import java.util.Comparator;

class OrdenaNome implements Comparator<Pessoa> {
	@Override
	public int compare(Pessoa um, Pessoa dois) {
		return um.getNome().compareTo(dois.getNome());
	}
}

/**
 * @author Patrick Fraga Ribeiro
 * @email patrix.pfr@gmail.com
 * 
 * Exercício da aula 20/10/2016
 **/

import java.util.Comparator;

class OrdenaIdade implements Comparator<Pessoa> {
	@Override
	public int compare(Pessoa um, Pessoa dois) {
		return um.getIdade() - dois.getIdade();
	}
}
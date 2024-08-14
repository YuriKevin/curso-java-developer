package strategy.classes;

import strategy.interfaces.DefesaStrategy;

public class DefesaEsquiva implements DefesaStrategy{
	@Override
	public void defesa() {
		System.out.println("Esquiva foi utilizada!");
	}
}

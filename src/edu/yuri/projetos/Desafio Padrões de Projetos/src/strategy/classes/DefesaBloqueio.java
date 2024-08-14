package strategy.classes;

import strategy.interfaces.DefesaStrategy;

public class DefesaBloqueio implements DefesaStrategy{
	@Override
	public void defesa() {
		System.out.println("Bloqueio foi utilizado!");
		
	}
}

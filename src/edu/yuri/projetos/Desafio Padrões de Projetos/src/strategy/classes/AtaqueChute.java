package strategy.classes;

import strategy.interfaces.AtaqueStrategy;

public class AtaqueChute implements AtaqueStrategy{
	@Override
	public void ataque() {
		System.out.println("Chute foi utilizado!");
	}
}

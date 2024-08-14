package strategy.classes;

import strategy.interfaces.AtaqueStrategy;

public class AtaqueSoco implements AtaqueStrategy{
	@Override
	public void ataque() {
		System.out.println("Soco foi utilizado!");
	}
}

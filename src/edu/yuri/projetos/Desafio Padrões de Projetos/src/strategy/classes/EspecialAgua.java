package strategy.classes;

import strategy.interfaces.EspecialStrategy;

public class EspecialAgua implements EspecialStrategy{
	@Override
	public void especial() {
		System.out.println("Tsunami foi invocado!");
	}
}

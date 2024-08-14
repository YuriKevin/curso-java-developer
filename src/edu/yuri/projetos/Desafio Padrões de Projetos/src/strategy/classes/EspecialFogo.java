package strategy.classes;

import strategy.interfaces.EspecialStrategy;

public class EspecialFogo implements EspecialStrategy{
	@Override
	public void especial() {
		System.out.println("Onda de calor foi invocada!");
	}
}

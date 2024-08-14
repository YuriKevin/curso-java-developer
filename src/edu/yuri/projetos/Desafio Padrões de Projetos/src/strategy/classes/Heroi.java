package strategy.classes;

import strategy.interfaces.AtaqueStrategy;
import strategy.interfaces.DefesaStrategy;
import strategy.interfaces.EspecialStrategy;

public class Heroi {
	private AtaqueStrategy ataque;
	private DefesaStrategy defesa;
	private EspecialStrategy especial;
	
	public void setAtaque(AtaqueStrategy ataque) {
		this.ataque = ataque;
	}
	public void setDefesa(DefesaStrategy defesa) {
		this.defesa = defesa;
	}
	public void setEspecial(EspecialStrategy especial) {
		this.especial = especial;
	}
	public AtaqueStrategy getAtaque() {
		return ataque;
	}
	public DefesaStrategy getDefesa() {
		return defesa;
	}
	public EspecialStrategy getEspecial() {
		return especial;
	}
	public Heroi() {
		
	}
}

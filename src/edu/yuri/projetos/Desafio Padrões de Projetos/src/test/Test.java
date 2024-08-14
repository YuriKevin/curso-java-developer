package test;

import strategy.classes.AtaqueChute;
import strategy.classes.AtaqueSoco;
import strategy.classes.DefesaBloqueio;
import strategy.classes.DefesaEsquiva;
import strategy.classes.EspecialAgua;
import strategy.classes.EspecialFogo;
import strategy.classes.Heroi;
import strategy.interfaces.AtaqueStrategy;
import strategy.interfaces.DefesaStrategy;
import strategy.interfaces.EspecialStrategy;

public class Test {
	public static void main(String[] args) {
		
        DefesaStrategy defesaBloqueio = new DefesaBloqueio();
        DefesaStrategy defesaEsquiva = new DefesaEsquiva();
        AtaqueStrategy ataqueChute = new AtaqueChute();
        AtaqueStrategy ataqueSoco = new AtaqueSoco();
        EspecialStrategy especialAgua = new EspecialAgua();
        EspecialStrategy especialFogo = new EspecialFogo();
        
        Heroi h1 = new Heroi();
        h1.setAtaque(ataqueChute);
        h1.getAtaque().ataque();
        h1.setAtaque(ataqueSoco);
        h1.getAtaque().ataque();
        h1.setDefesa(defesaBloqueio);
        h1.getDefesa().defesa();
        h1.setDefesa(defesaEsquiva);
        h1.getDefesa().defesa();
        h1.setEspecial(especialAgua);
        h1.getEspecial().especial();
        h1.setEspecial(especialFogo);
        h1.getEspecial().especial();
	}
}

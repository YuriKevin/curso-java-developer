package Equipamento_Multifuncional;

import Equipamento_Multifuncional.copiadora.Copiadora;
import Equipamento_Multifuncional.digitalizadora.Digitalizadora;
import Equipamento_Multifuncional.equipamento_multifuncional.EquipamentoMultifuncional;
import Equipamento_Multifuncional.impressora.Impressora;
import Equipamento_Multifuncional.impressora.Laserjet;
import Equipamento_Multifuncional.equipamento_multifuncional.EquipamentoMultifuncional;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Laserjet();
        impressora.imprimir();

        Impressora impressora2 = new EquipamentoMultifuncional();
        impressora2.imprimir();

        EquipamentoMultifuncional ef = new EquipamentoMultifuncional();
                ef.imprimir();
        
        Impressora imp = ef;
        Digitalizadora dig = ef;
        Copiadora cop = ef;


    }
}

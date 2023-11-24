package Equipamento_Multifuncional.equipamento_multifuncional;

import Equipamento_Multifuncional.copiadora.Copiadora;
import Equipamento_Multifuncional.digitalizadora.Digitalizadora;
import Equipamento_Multifuncional.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar(){
        System.out.println("Copiando via equipamento mulfifuncional...");
     };

     public void digitalizar(){
        System.out.println("Digitalizando via equipamento mulfifuncional...");
     }
     public void imprimir(){
        System.out.println("Imprimindo via equipamento mulfifuncional...");
     }
    
}

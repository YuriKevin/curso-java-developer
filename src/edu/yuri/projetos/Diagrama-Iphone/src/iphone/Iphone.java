package iphone;
import ipod.Ipod;
import navegador.Navegador;
import telefone.Telefone;

public class Iphone implements Ipod, Navegador, Telefone{

    
    public void ligar() {
        System.out.println("Ligando...");
    }

    
    public void atender() {
        System.out.println("Ligação atendida.");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz..");
    }

    
    public void exibirPagina() {
        System.out.println("Página exibida.");
    }

    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    
    public void tocar() {
        System.out.println("Tocando música...");
    }

    
    public void pausar() {
        System.out.println("Música pausada.");
    }

    
    public void selecionarMusica() {
        System.out.println("");
    }
    
}

package Sistemas_de_mensagens.aplicativos;

public class Msn extends SistemaChat{
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Mensagem enviada pelo MSN.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo MSN.");
        salvarHistoricoMensagem();
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Histórico salvo.");
    }
}

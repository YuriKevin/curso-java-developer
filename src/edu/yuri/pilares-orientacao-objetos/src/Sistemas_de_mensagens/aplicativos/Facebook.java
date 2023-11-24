package Sistemas_de_mensagens.aplicativos;

public class Facebook extends SistemaChat{
    public void enviarMensagem(){
        validarConexao();
        System.out.println("Mensagem enviada pelo Facebook.");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo Facebook.");
        salvarHistoricoMensagem();
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Histórico salvo.");
    }
}

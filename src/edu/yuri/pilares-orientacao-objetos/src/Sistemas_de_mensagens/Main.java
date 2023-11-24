package Sistemas_de_mensagens;

import Sistemas_de_mensagens.aplicativos.Facebook;
import Sistemas_de_mensagens.aplicativos.Msn;
import Sistemas_de_mensagens.aplicativos.SistemaChat;
import Sistemas_de_mensagens.aplicativos.Telegram;

public class Main {
    public static void main(String[] args) {
        SistemaChat app = null;

        String appEscolhido = "facebook";

        if(appEscolhido=="msn"){
            app = new Msn();
        }
        else if(appEscolhido=="facebook"){
            app = new Facebook();
        }
        else if(appEscolhido=="telegram"){
            app = new Telegram();
        }
        
        app.enviarMensagem();

       

        
      

        
    
    }
}

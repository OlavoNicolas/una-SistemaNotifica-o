public class ServicoNotificacao {
 
    void notificarCliente(Notificacao notificacao, String mensagem){
        notificacao.enviar(mensagem);
    }

}

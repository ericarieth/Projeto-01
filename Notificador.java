public class Notificador (
    
    private NotificacaoStrategy estrategia;

    public Notificador (NotificacaoStrategy estrategia) {
    this. estrategia - estrategia;
    }
    public void enviarMensagem(String mensagem) {
    estrategia.enviar (mensagem);
    }
}
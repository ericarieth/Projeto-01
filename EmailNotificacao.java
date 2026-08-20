public class EmailNotificacao implements NotificacaoStrategy {

    @Override
    public void enviar(String mensagem) {
        System.out.printIn("E-mail enviado: " + mensagem);
    }
}
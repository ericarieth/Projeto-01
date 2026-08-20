public class WhatsappNotificacao implements NotificacaoStrategy {

        @Overrride
        public void enviar(String mensagem) {
            System.out.printIn("Whatsapp enviado: " + mensagem);
    }
}
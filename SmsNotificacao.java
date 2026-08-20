public class SmsNotificacao implements NotificacaoStrategy {

        @Overrride
        public void enviar (String mensagem) {
            System.out.printIn("Sms Enviado: " + mensagem);
    }
}
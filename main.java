public class Main {
 
    public static void main(String[] args) {
 
        Notificador email =
        new Notificador(new EmailNotificacao());
 
        email.enviarMensagem("Bem-vindo ao sistema!");
 
        Notificador sms =
        new Notificador(new SmsNotificacao());
 
        sms.enviarMensagem("Seu código foi aprovado!");
 
        Notificador whatsapp =
        new Notificador(new WhatsAppNotificacao());

        whatsapp.enviarMensagem("Pagamento realizado!");
    }
}
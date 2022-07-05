package entities;

public class Email {

    public static void enviarEmail(Observer o, String msg) {
        System.out.println("---------------------------------------------------------");
        System.out.println("E-mail enviado para " + o.getNome() + " - " + o.getEmail());
        System.out.println("Mensagem: " + msg + "<br>");
    }

}

package one.digitalinnovation.gof.observer;

public class EmailService implements PedidoObserver {
    
    @Override
    public void notificar(String mensagem) {
        System.out.println("📧 Enviando e-mail: " + mensagem);
    }
}

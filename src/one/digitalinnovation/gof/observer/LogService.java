package one.digitalinnovation.gof.observer;

public class LogService implements PedidoObserver{

	@Override
	public void notificar(String mensagem) {		
		System.out.println("📝 Gravando no log: " + mensagem);
	}

}

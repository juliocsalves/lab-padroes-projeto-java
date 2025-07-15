package one.digitalinnovation.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private List<PedidoObserver> observadores = new ArrayList<>();

    public void adicionarObserver(PedidoObserver observer) {
        observadores.add(observer);
    }

    public void realizarPedido(String pedido) {
        System.out.println("✅ Pedido realizado: " + pedido);
        notificarTodos("Pedido '" + pedido + "' foi processado com sucesso!");
    }

    private void notificarTodos(String mensagem) {
        for (PedidoObserver observer : observadores) {
            observer.notificar(mensagem);
        }
    }

}

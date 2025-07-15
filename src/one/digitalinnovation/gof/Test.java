package one.digitalinnovation.gof;

import one.digitalinnovation.gof.builder.Cliente;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.observer.EmailService;
import one.digitalinnovation.gof.observer.LogService;
import one.digitalinnovation.gof.observer.PedidoService;

public class Test {

	public static void main(String[] args) {

		// Singleton
		System.out.println("=== Singleton ===");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Strategy
		System.out.println("=== Strategy ===");
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade
		System.out.println("=== Facade ===");
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");

		// Observer
		System.out.println("=== Observer ===");
		PedidoService pedidoService = new PedidoService();
		pedidoService.adicionarObserver(new EmailService());
		pedidoService.adicionarObserver(new LogService());
		pedidoService.realizarPedido("Katana Envenenada");

		System.out.println("=== Builder ===");

		Cliente cliente = new Cliente.Builder()
				.nome("Kakashi Hatake")
				.cpf("123.456.789-00")
				.email("kakashi@konohagakure.jp")
				.telefone("99999-9999")
				.build();

		System.out.println(cliente);
	}

}

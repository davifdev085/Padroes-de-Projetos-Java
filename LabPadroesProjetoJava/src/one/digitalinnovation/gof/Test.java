package one.digitalinnovation.gof;

import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
	public static void main(String[] args) {
		
		// Testes relacionados ao Design Pattern Singleton;
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
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		Robo robo1 = new Robo();
		robo.setComportamento(defensivo);
		robo.mover();
		
		Robo robo2 = new Robo();
		robo.setComportamento(agressivo);
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Davi Felipe", "607656565");
	}

}

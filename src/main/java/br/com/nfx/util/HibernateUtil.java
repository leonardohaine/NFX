package br.com.nfx.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory fabricaDeSessao = criaFabricaSessao();

	public static SessionFactory getFabricaDeSessao() {
		return fabricaDeSessao;
	}

	private static SessionFactory criaFabricaSessao(){
		
		try {
			
		
		Configuration configuracao = new Configuration().configure();
		ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
		
		SessionFactory fabrica = configuracao.buildSessionFactory(registro);
		
		return fabrica;
	}catch (Throwable ex) {
		System.err.println("A fábrica de sessões não pode ser criada." + ex);
		throw new ExceptionInInitializerError(ex);
	} 


		
	}
}
	
	
	


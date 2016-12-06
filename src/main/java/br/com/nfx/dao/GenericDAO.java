package br.com.nfx.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.nfx.util.HibernateUtil;

public class GenericDAO<Entidade> {
	
	@Autowired
	private SessionFactory sessionFactory;

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
public void salvar(Entidade entidade){
		
	
		getSessionFactory().getCurrentSession().saveOrUpdate(entidade);
		/*Session sessao = HibernateUtil.getFabricaDeSessao().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();
		}catch(RuntimeException ex){
			if(transacao != null){
				transacao.rollback();
			}
			throw ex;
			
		}finally {

			sessao.close();
		
		}	*/
	


}
}

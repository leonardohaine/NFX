package br.com.nfx.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "nfxEntityManagerFactory", 
		transactionManagerRef = "nfxTransactionManager",				
		basePackages = {
        "br.com.nfx.dao", "br.com.nfx.repository", "br.com.nfx.service"
})
@ComponentScan("br.com.nfx")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
	

	
	@Bean(name="nfxEntityManagerFactory")
	LocalContainerEntityManagerFactoryBean nfxEntityManagerFactory(Environment env, @Qualifier("nfxDataSource")DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
//		try{
//			ComboPooledDataSource ds = new ComboPooledDataSource();
////			ds.setDriverClass(env.getRequiredProperty("app.jdbc.driverClassName"));
////			ds.setJdbcUrl(env.getRequiredProperty("app.jdbc.url"));
////			ds.setUser(env.getRequiredProperty("app.jdbc.username"));
////			ds.setPassword(env.getRequiredProperty("app.jdbc.password"));
//			ds.setAcquireIncrement(5);
//			ds.setIdleConnectionTestPeriod(60);
//			ds.setMaxPoolSize(100);
//			ds.setMaxStatements(50);
//			ds.setMinPoolSize(10);
//			
//			dataSource = ds;
//		}catch (Exception e) {
//			throw new RuntimeException(e);
//		}
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan("br.com.nfx.model");

		Properties jpaProperties = new Properties();

		// Configures the used database dialect. This allows Hibernate to create
		// SQL
		// that is optimized for the used database.
		jpaProperties.put("hibernate.dialect", this.getRequiredProperty(env, "hibernate.dialect"));

		// Specifies the action that is invoked to the database when the
		// Hibernate
		// SessionFactory is created or closed.
		jpaProperties.put("hibernate.hbm2ddl.auto", this.getRequiredProperty(env, "hibernate.hbm2ddl.auto"));

		// Configures the naming strategy that is used when Hibernate creates
		// new database objects and schema elements
		jpaProperties.put("hibernate.ejb.naming_strategy", this.getRequiredProperty(env, "hibernate.ejb.naming_strategy"));

		// If the value of this property is true, Hibernate writes all SQL
		// statements to the console.
		jpaProperties.put("hibernate.show_sql", this.getRequiredProperty(env, "hibernate.show_sql"));

		// If the value of this property is true, Hibernate will format the SQL
		// that is written to the console.
		jpaProperties.put("hibernate.format_sql", this.getRequiredProperty(env, "hibernate.format_sql"));
		
		String defaultSchema = this.getOptionalProperty(env, "hibernate.default_schema");
		if (defaultSchema != null) {
			jpaProperties.put("hibernate.default_schema", defaultSchema);
		}

		entityManagerFactoryBean.setJpaProperties(jpaProperties);
		
		entityManagerFactoryBean.setPersistenceUnitName("nfx.".concat("persistence"));

		return entityManagerFactoryBean;
	}
	
	@Bean(name="nfxDataSource")
	DataSource nfxDataSource() throws Exception {
		System.out.println("Obtendo datasource...");
        JndiTemplate jndi = new JndiTemplate();
        
        DataSource ds = (DataSource) jndi.lookup("java:comp/env/jdbc/nfxDS");
        System.out.println(ds.getLogWriter());
        return ds;
	}
	
	@Bean(name="nfxTransactionManager")
	JpaTransactionManager nfxTransactionManager(EntityManagerFactory nfxEntityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(nfxEntityManagerFactory);
		return transactionManager;
	}
	
	public String getRequiredProperty(Environment env, String propertyName) {
		return env.getRequiredProperty("nfx.".concat(propertyName));
	}

	public String getOptionalProperty(Environment env, String propertyName) {
		return env.getProperty("nfx.".concat(propertyName));
	}
	

	
	

}

package com.spring.fram.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.primefaces.component.resource.Resource;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
public class DataSourceConfig {
	@Profile("dev")
	@Bean
	public DataSource dataSource(){
		BasicDataSource dSource =new  BasicDataSource();
		//set参数
		
		return dSource;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean lsf = new LocalSessionFactoryBean();
		lsf.setDataSource(dataSource);
		lsf.setMappingLocations();
		Properties p = new Properties();
		//此处设置参数
		p.put("hibernate.cache.provider_class", "net.sf.ehcache.hibernate.EhCacheProvider");
		p.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
		p.put("javax.persistence.validation.mode", "none");
		
		lsf.setHibernateProperties(p);
		
		return lsf;
	}
	//定义一个异常转换类，为拥有@repository注解标记的添加通知。 
	@Bean 
	public BeanPostProcessor persistenceTranslation(){
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
	

	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabasePlatform("org.hibernate.dialect.ORACLEDialect");
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false); 
		
		return adapter;
		
				
	}
}

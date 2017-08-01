package com.spring.fram.config;

import net.sf.ehcache.CacheManager;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


@Configuration
@EnableCaching
public class CachingConfig {

	
	@Bean
	public EhCacheCacheManager cacheManager(CacheManager cacheManager) {
		return new EhCacheCacheManager(cacheManager);
		
	}
	@Bean
	public EhCacheManagerFactoryBean ehcache() {
		EhCacheManagerFactoryBean eManagerFactoryBean = new EhCacheManagerFactoryBean();
		eManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
		return eManagerFactoryBean;
		
	}
}

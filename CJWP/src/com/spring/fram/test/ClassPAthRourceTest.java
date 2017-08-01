package com.spring.fram.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.fram.config.SprittwerAppWebInitializer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class ClassPAthRourceTest {

	@Test
	public void  test() {
		System.out.println( "sdsa");
		
		
		ClassPathResource cpr = new ClassPathResource("ehcache.xml");
		System.out.println(cpr.getPath());
		System.out.println(this.getClass().getResource("").getPath());
		System.out.println(this.getClass().getClassLoader().getResource("ehcache.xml").getPath());
	}
}

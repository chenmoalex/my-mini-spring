package com.chenmoalex.myminiioc.test;

import java.util.Map;

import org.junit.Test;

import com.chenmoalex.myminiioc.BeanDefinition;
import com.chenmoalex.myminiioc.factory.AutowireCapableBeanFactory;
import com.chenmoalex.myminiioc.factory.BeanFactory;
import com.chenmoalex.myminiioc.io.ResourceLoader;
import com.chenmoalex.myminiioc.io.xml.XmlBeanDefinitionReader;


public class TestBeanFactory {

	@Test
	public void testBeanFactory() throws Exception {
		
		//读取XML配置
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("minispringioc.xml");
		
		
		
		// 初始化一个factory
		BeanFactory beanFactory = new AutowireCapableBeanFactory();

		// 注入bean
		for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
			beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
		}

		// get一个bean
		DemoService demoServiceTest = (DemoService) beanFactory.getBean("demoService");
		demoServiceTest.demoAction();
		
	}
}

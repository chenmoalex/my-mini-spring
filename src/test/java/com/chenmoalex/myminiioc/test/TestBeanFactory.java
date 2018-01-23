package com.chenmoalex.myminiioc.test;

import org.junit.Test;

import com.chenmoalex.myminiioc.BeanDefinition;
import com.chenmoalex.myminiioc.PropertyValue;
import com.chenmoalex.myminiioc.PropertyValues;
import com.chenmoalex.myminiioc.factory.AutowireCapableBeanFactory;
import com.chenmoalex.myminiioc.factory.BeanFactory;

public class TestBeanFactory {

	@Test
	public void testBeanFactory() {
		// 初始化一个factory
		BeanFactory beanFactory = new AutowireCapableBeanFactory();

		// 注入bean
		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setBeanClassName("com.chenmoalex.myminiioc.test.DemoService");
		
		
		DemoPojo demoPojo = new DemoPojo(1L, "name=1");
		
		// 注入属性
		PropertyValues propertyValues = new PropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("text", "hello!"));
		propertyValues.addPropertyValue(new PropertyValue("demoPojo", demoPojo));
		beanDefinition.setPropertyValues(propertyValues);

		beanFactory.registerBeanDefinition("DemoService", beanDefinition);

		// get一个bean
		DemoService demoServiceTest = (DemoService) beanFactory.getBean("DemoService");
		demoServiceTest.demoAction();
		
	}
}

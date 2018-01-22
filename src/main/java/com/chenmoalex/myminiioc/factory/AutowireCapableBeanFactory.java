package com.chenmoalex.myminiioc.factory;

import com.chenmoalex.myminiioc.BeanDefinition;

public class AutowireCapableBeanFactory extends AbstractBeanFactory {

	@Override
	protected Object doCreateBean(BeanDefinition beanDefinition) {
		try {
			
			Object bean = beanDefinition.getBeanClass().newInstance();
			return bean;

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return null;
	}
}

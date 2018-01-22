package com.chenmoalex.myminiioc.factory;

import com.chenmoalex.myminiioc.BeanDefinition;

public interface BeanFactory {

	Object getBean(String name);

	void registerBeanDefinition(String name, BeanDefinition beanDefinition);

}

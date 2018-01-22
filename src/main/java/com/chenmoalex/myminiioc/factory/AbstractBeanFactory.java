package com.chenmoalex.myminiioc.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.chenmoalex.myminiioc.BeanDefinition;

public abstract class AbstractBeanFactory implements BeanFactory {

	private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

	@Override
	public Object getBean(String name) {

		return beanDefinitionMap.get(name).getBean();
	}

	@Override
	public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
		Object bean = doCreateBean(beanDefinition);
		beanDefinition.setBean(bean);
		beanDefinitionMap.put(name, beanDefinition);
	}

	/**
	 * 
	 * 一个抽象的，实例化、初始化bean的方法
	 * 
	 * @param beanDefinition
	 * @return
	 */
	protected abstract Object doCreateBean(BeanDefinition beanDefinition);

}

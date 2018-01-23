package com.chenmoalex.myminiioc.factory;

import java.lang.reflect.Field;

import com.chenmoalex.myminiioc.BeanDefinition;
import com.chenmoalex.myminiioc.PropertyValue;

public class AutowireCapableBeanFactory extends AbstractBeanFactory {

	@Override
	protected Object doCreateBean(BeanDefinition beanDefinition) {
		try {

			Object bean = createBeanInstance(beanDefinition);

			applyPropertyValues(bean, beanDefinition);
			return bean;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	protected Object createBeanInstance(BeanDefinition beanDefinition) {
		try {
			return beanDefinition.getBeanClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) {

		for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {

			try {
				Field declaredFiled = bean.getClass().getDeclaredField(propertyValue.getName());
				declaredFiled.setAccessible(true);
				declaredFiled.set(bean, propertyValue.getValue());

			} catch (NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		}

	}

}

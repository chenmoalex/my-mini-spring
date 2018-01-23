package com.chenmoalex.myminiioc;

/**
 * 
 * Bean定义
 * 
 * @author chenmo
 *
 */
public class BeanDefinition {

	private Object bean;

	private Class beanClass;

	private String beanClassName;

	private PropertyValues propertyValues;

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}

	public BeanDefinition() {
	}

	public Object getBean() {
		return bean;
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public String getBeanClassName() {
		return beanClassName;
	}

	public void setBeanClassName(String beanClassName) {
		this.beanClassName = beanClassName;

		try {
			this.beanClass = Class.forName(beanClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

package com.chenmoalex.myminiioc;

import java.util.HashMap;
import java.util.Map;

import com.chenmoalex.myminiioc.io.ResourceLoader;

public abstract class AbstractBeanDefinitionReader {

	private Map<String, BeanDefinition> registry;

	private ResourceLoader resourceLoader;

	protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
		this.registry = new HashMap<String, BeanDefinition>();
		this.resourceLoader = resourceLoader;
	}

	public Map<String, BeanDefinition> getRegistry() {
		return registry;
	}

	public ResourceLoader getResourceLoader() {
		return resourceLoader;
	}

}

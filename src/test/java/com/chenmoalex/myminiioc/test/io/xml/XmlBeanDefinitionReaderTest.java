package com.chenmoalex.myminiioc.test.io.xml;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.chenmoalex.myminiioc.BeanDefinition;
import com.chenmoalex.myminiioc.io.ResourceLoader;
import com.chenmoalex.myminiioc.io.xml.XmlBeanDefinitionReader;

public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("minispringioc.xml");

		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		Assert.assertTrue(registry.size() > 0);
	}
}

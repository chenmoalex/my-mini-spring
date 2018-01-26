package com.chenmoalex.myminiioc.test.io;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.chenmoalex.myminiioc.io.Resource;
import com.chenmoalex.myminiioc.io.ResourceLoader;

import junit.framework.Assert;

public class ResourceLoaderTest {

	@Test
	public void test() throws IOException {
		ResourceLoader resourceLoader = new ResourceLoader();
		Resource resource = resourceLoader.getResource("minispringioc.xml");
		InputStream inputStream = resource.getInputStream();
		Assert.assertNotNull(inputStream);
	}
}

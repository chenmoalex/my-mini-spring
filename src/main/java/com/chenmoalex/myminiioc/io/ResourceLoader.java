package com.chenmoalex.myminiioc.io;

import java.net.URL;


public class ResourceLoader {

	public Resource getResource(String location) {
		
		
		/*
		 * TODO 这么写是为什么?
		 */
		URL resource = this.getClass().getClassLoader().getResource(location);
		
		return new UrlResource(resource);
	}
}

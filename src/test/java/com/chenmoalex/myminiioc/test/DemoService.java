package com.chenmoalex.myminiioc.test;

public class DemoService {

	private String text;

	private DemoPojo demoPojo;

	public DemoService() {
	}

	public void demoAction() {

		System.out.println("text:" + text + ", demoPojo:" + demoPojo.toString());

	}

}

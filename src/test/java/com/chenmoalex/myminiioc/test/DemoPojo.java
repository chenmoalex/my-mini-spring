package com.chenmoalex.myminiioc.test;

public class DemoPojo {

	private Long id;

	private String name;

	public DemoPojo(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DemoPojo [id=" + id + ", name=" + name + "]";
	}

}

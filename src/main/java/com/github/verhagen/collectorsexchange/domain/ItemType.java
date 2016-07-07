package com.github.verhagen.collectorsexchange.domain;

public class ItemType {
	private final String name;


	public ItemType(final String name) {
		this.name = name;
	}

	public static ItemType create(final String name) {
		return new ItemType(name);
	}

	public String getName() {
		return name;
	}
	
}

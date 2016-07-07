package com.github.verhagen.collectorsexchange.domain;

public class Tag {
	private final String name;

	public Tag(String name) {
		this.name = name;
	}

	public static Tag create(final String name) {
		return new Tag(name);
	}

	public String getName() {
		return name;
	}

}

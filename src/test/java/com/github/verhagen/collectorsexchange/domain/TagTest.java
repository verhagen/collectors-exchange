package com.github.verhagen.collectorsexchange.domain;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TagTest {

	@Test
	public void create() throws Exception {
		Tag tag = Tag.create("Albert-Hein");
		assertEquals("Albert-Hein", tag.getName());
	}

}

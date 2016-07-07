package com.github.verhagen.collectorsexchange.domain;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ItemTypeTest {

	@Test
	public void create() throws Exception {
		ItemType itemTypeBook = ItemType.create("book");
		ItemType itemTypeImage = ItemType.create("image");
		
		assertEquals("book", itemTypeBook.getName());
		assertEquals("image", itemTypeImage.getName());
	}

}

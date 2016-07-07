package com.github.verhagen.collectorsexchange.domain;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ItemTest {

	@Test
	public void create() throws Exception {
		ItemType itemTypeImage = ItemType.create("image");
		Item item1 = Item.create(itemTypeImage, "1");
		Item item2 = Item.create(itemTypeImage, "2");
		
		assertEquals("image", item1.getItemType().getName());
		assertEquals("1", item1.getId());
		
		assertEquals("image", item2.getItemType().getName());
		assertEquals("2", item2.getId());
	}
}

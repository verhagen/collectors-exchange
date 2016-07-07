package com.github.verhagen.collectorsexchange.domain;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class CollectionTest {

	@Test
	public void create() throws Exception {
		ItemType itemTypeImage = ItemType.create("image");
		Collection coll = new Collection.Builder()
				.setName("Terug naar de Dino's met Freek")
				.setDescription("Albert-Hein spaaractie zomer 2016")
				.add(Item.create(ItemType.create("book"), "1"))
				.add(Item.create(itemTypeImage, "1"))
				.add(Item.create(itemTypeImage, "2"))
				.create();

		assertEquals(coll.getName(), "Terug naar de Dino's met Freek");
		assertEquals(coll.getDescription(), "Albert-Hein spaaractie zomer 2016");
		assertNotNull(coll.getItems());
		assertEquals(coll.getItems().size(), 2);
	}
}

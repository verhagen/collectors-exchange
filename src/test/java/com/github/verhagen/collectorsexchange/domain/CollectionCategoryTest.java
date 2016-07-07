package com.github.verhagen.collectorsexchange.domain;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class CollectionCategoryTest {

	@Test
	public void create() throws Exception {
		Tag tagAh = Tag.create("Albert-Hein");
		Tag tag2016 = Tag.create("2016");
        CollectionCategory category = CollectionCategory.create(
				createCollection()
				, tagAh
				, Tag.create("spaaractie")
				, tag2016
				);

		assertEquals(category.getTags().size(), 3);
		assertTrue(category.getTags().contains(tag2016));
		assertTrue(category.getTags().contains(tagAh), "The collection should contain the tag '"
				+ tagAh.getName() + "'");
	}


	private Collection createCollection() {
		ItemType itemTypeImage = ItemType.create("image");
		Collection coll = new Collection.Builder()
				.setName("Terug naar de Dino's met Freek")
				.setDescription("Albert-Hein spaaractie zomer 2016")
				.add(Item.create(ItemType.create("book"), "1"))
				.add(Item.create(itemTypeImage, "1"))
				.add(Item.create(itemTypeImage, "2"))
				.create();
		return coll;
	}

}

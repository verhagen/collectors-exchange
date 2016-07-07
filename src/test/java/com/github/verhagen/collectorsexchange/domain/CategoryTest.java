package com.github.verhagen.collectorsexchange.domain;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class CategoryTest {

	@Test
	public void create() throws Exception {
		Tag albertHeinTag = Tag.create("Albert-Hein");
		Tag ahTag = Tag.create("AH");
		Category albertHeinCat = new Category.Builder()
				.add(albertHeinTag)
				.add(ahTag)
				.add(ahTag)
				.create();
		assertEquals(albertHeinCat.getTags().size(), 2);
		assertTrue(albertHeinCat.getTags().contains(albertHeinTag));
		assertTrue(albertHeinCat.getTags().contains(ahTag));
		assertNull(albertHeinCat.getParent());
		
		Tag dinoTag = Tag.create("Terug naar de Dino's met Freek");
		Category dinos = new Category.Builder()
				.setParent(albertHeinCat)
				.add(dinoTag)
				.create();
		
		assertEquals(dinos.getTags().size(), 1);
		assertTrue(dinos.getTags().contains(dinoTag));
		assertEquals(dinos.getParent(), albertHeinCat);
		assertEquals(albertHeinCat.getChildren().size(), 1);
	}

}

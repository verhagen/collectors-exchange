package com.github.verhagen.collectorsexchange.domain;

public class Item {
	private final ItemType itemType;
	private final String id;

	public Item(final ItemType itemType, final String id) {
		this.itemType = itemType;
		this.id = id;
	}

	public static Item create(final ItemType itemType, final String id) {
		return new Item(itemType, id);
	}

	public ItemType getItemType() {
		return itemType;
	}

	public String getId() {
		return id;
	}

}

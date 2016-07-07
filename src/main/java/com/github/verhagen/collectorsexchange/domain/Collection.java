package com.github.verhagen.collectorsexchange.domain;

import java.util.HashMap;
import java.util.Map;

public class Collection {
	private final String name;
	private final String description;
	private final Map<String, Item> items = new HashMap<>();


	public Collection(final Builder bldr) {
		this.name = bldr.getName();
		this.description = bldr.getDescription();
		this.items.putAll(bldr.getItems());
	}


	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Item> getItems() {
		return items;
	}



	public static class Builder {
		private String name;
		private String description;
		private Map<String, Item> items = new HashMap<>();


		public Collection create() {
			return new Collection(this);
		}


		public String getName() {
			return name;
		}
		public Builder setName(final String name) {
			this.name = name;
			return this;
		}
		public String getDescription() {
			return description;
		}
		public Builder setDescription(final String description) {
			this.description = description;
			return this;
		}
		public Builder add(final Item item) {
			items.put(item.getId(), item);
			return this;
		}
		public Map<String, Item> getItems() {
			return items;
		}
	}
}

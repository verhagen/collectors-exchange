package com.github.verhagen.collectorsexchange.domain;

import java.util.HashSet;
import java.util.Set;

public class Category extends AbstractCatgegory {
	private final Category parent;
	private final Set<AbstractCatgegory> childs;


	public Category(final Builder bldr) {
		super(bldr.getTags());
		this.parent = bldr.getParent();
		this.childs = bldr.getChildren();

		if (this.parent != null) {
			this.parent.add(this);
		}
	}
	

	private void add(final AbstractCatgegory category) {
		childs.add(category);
	}


	public Category getParent() {
		return parent;
	}

	public Set<AbstractCatgegory> getChildren() {
		return childs;
	}



	public static class Builder {
		private Category parent;
		private Set<AbstractCatgegory> childs = new HashSet<>();
		private Set<Tag> tags = new HashSet<>();

		public Category create() {
			return new Category(this);
		}

		public Set<AbstractCatgegory> getChildren() {
			return childs;
		}

		public Category getParent() {
			return parent;
		}
		public Builder setParent(final Category parent) {
			this.parent = parent;
			return this;
		}
		public Builder add(final Tag tag) {
			tags.add(tag);
			return this;
		}
		public Builder add(final AbstractCatgegory cat) {
			childs.add(cat);
			return this;
		}

		public Set<Tag> getTags() {
			return tags;
		}
	}
}

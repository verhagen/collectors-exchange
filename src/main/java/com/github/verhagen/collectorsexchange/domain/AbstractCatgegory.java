package com.github.verhagen.collectorsexchange.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AbstractCatgegory {
	private final Set<Tag> tags = new HashSet<>();


	protected AbstractCatgegory(final List<Tag> asList) {
		this(convert(asList));
	}
	protected AbstractCatgegory(final Set<Tag> tags) {
		this.tags.addAll(tags);
	}


	public Set<Tag> getTags() {
		return tags;
	}


	private static Set<Tag> convert(final List<Tag> asList) {
		final Set<Tag> tags = new HashSet<>();
		for (Tag tag : asList) {
			tags.add(tag);
		}
		return tags;
	}

}

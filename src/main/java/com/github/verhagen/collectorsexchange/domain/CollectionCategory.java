package com.github.verhagen.collectorsexchange.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionCategory extends AbstractCatgegory {
	private final Collection coll;


	public CollectionCategory(final Collection coll, final List<Tag> asList) {
		super(asList);

		this.coll = coll;
	}


	public static CollectionCategory create(final Collection coll, final Tag... tagArray) {
		return new CollectionCategory(coll, Arrays.asList(tagArray));
	}

}

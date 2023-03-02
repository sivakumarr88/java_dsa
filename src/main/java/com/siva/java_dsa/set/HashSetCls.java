package com.siva.java_dsa.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCls {

	private Set<String> strHashSet = new HashSet<String>();
	
	public Set<String> getStrHashSet() {
		return strHashSet;
	}

	public boolean addAllElements(List<String> list) {
		if(!(list instanceof ArrayList)) {
			throw new IllegalArgumentException("Input should be an ArrayList");
		}
		return strHashSet.addAll(list);
	}
	
	public int size() {
		return strHashSet.size();
	}

}

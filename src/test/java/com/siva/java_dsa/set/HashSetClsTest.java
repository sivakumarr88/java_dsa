package com.siva.java_dsa.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class HashSetClsTest {

	HashSetCls testCls = new HashSetCls();

	@Test(expected = IllegalArgumentException.class)
	public void testAddAllElementsForException() {

		testCls.addAllElements(new LinkedList<String>());
	}

	@Test
	public void testAddAllElements() {
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("one");
		strList.add("four");
		strList.add("two");
		strList.add("three");

		Assert.assertTrue(testCls.addAllElements(strList));
	}
	
	@Test
	public void testSize() {
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("one");
		strList.add("four");
		strList.add("two");
		strList.add("three");
		
		testCls.addAllElements(strList);
		
		Assert.assertEquals(4, testCls.size());
	}
	
	@Test
	public void testGetStrHashSet() {
		Assert.assertEquals(new HashSet<String>(), testCls.getStrHashSet());
	}

}

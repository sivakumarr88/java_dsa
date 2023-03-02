package com.siva.java_dsa.set;

import java.util.ArrayList;
import java.util.List;

public class MainCls {
	
	public static void main(String args[]) {
		HashSetCls hsObj = new HashSetCls();
		
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("one");
		strList.add("four");
		strList.add("two");
		strList.add("three");
				
		hsObj.addAllElements(strList);
		
		System.out.println(hsObj.getStrHashSet());
		
		System.out.println(hsObj.size());
	}
	
}
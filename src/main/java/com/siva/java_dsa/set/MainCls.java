package com.siva.java_dsa.set;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainCls {
	
	private static final Logger LOGGER = LogManager.getLogger(MainCls.class);
	
	public static void main(String[] args) {
		HashSetCls hsObj = new HashSetCls();
		
		List<String> strList = new ArrayList<>();
		strList.add("one");
		strList.add("one");
		strList.add("four");
		strList.add("two");
		strList.add("three");
				
		hsObj.addAllElements(strList);
		
		LOGGER.info(hsObj.getStrHashSet());
		
		LOGGER.debug(hsObj.size());
	}
	
}
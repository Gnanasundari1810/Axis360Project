package org.photon.test.datatype;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class listToSet {
	 
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Apple");
		l.add("Orange");
		l.add("Apple");
		l.add("Banana");
		l.add("Pineapple");
		
		Set<String> sD = new LinkedHashSet<>(l);
		List<String> lD = new ArrayList<>(sD);
		System.out.println(lD);
	}
	
	
	
	
	

}

package com.cubic.training.collectionexercise;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentComp>{

	@Override
	public int compare(StudentComp o1, StudentComp o2) {
	
		return o1.name.compareTo(o2.name);
		
	}

}

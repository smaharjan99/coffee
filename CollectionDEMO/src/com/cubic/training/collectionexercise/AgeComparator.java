package com.cubic.training.collectionexercise;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComp>{

	@Override
	public int compare(StudentComp o1, StudentComp o2) {
		if(o1.age ==o2.age){
			return 0;
		}else if(o1.age >o2.age){
			return 1;
		}else
		return -1;
	}

}

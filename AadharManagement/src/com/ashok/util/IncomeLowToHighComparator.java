package com.ashok.util;

import java.util.Comparator;

import com.ashok.model.Aadhar;

public class IncomeLowToHighComparator implements Comparator<Aadhar> {

	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		// TODO Auto-generated method stub
		if(o1.getIncome()<o2.getIncome())
			return -1;
		else if(o1.getIncome()>o2.getIncome())
			return 1;
		else
		return 0;
	}

}

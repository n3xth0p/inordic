package ru.inordic.study14.mycomparator;

import java.util.Comparator;

public class DigitValueComparator implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub	
		return Integer.parseInt(a) < Integer.parseInt(b) ? -1 : 1;
	}

}

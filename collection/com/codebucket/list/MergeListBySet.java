package com.codebucket.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MergeListBySet {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		List<MergeListData> listEmployees = new ArrayList<MergeListData>();		
		listEmployees.add(new MergeListData("Sam", "Designer", 30, 75000));

		List<MergeListData> listEmployeesDuplecate = new ArrayList<MergeListData>();		
		listEmployeesDuplecate.add(new MergeListData("Sam", "Designer", 30, 75000));
		
		System.out.println(set);
		set.add(listEmployees);
		System.out.println(set);
		set.add(listEmployeesDuplecate);		
		System.out.println(set);
	}

}

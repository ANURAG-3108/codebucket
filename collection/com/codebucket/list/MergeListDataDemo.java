package com.codebucket.list;

import java.util.ArrayList;
import java.util.List;

public class MergeListDataDemo {

	public static void main(String[] args) {
		List<MergeListData> listEmployees = new ArrayList<MergeListData>();

		listEmployees.add(new MergeListData("Tom", "Developer", 45, 80000));
		listEmployees.add(new MergeListData("Sam", "Designer", 30, 75000));
		listEmployees.add(new MergeListData("Bob", "Designer", 45, 134000));
		listEmployees.add(new MergeListData("Peter", "Programmer", 25, 60000));
		listEmployees.add(new MergeListData("Tim", "Designer", 45, 130000));
		listEmployees.add(new MergeListData("Craig", "Programmer", 30, 52000));
		listEmployees.add(new MergeListData("Anne", "Programmer", 25, 51000));
		listEmployees.add(new MergeListData("Alex", "Designer", 30, 120000));
		listEmployees.add(new MergeListData("Bill", "Programmer", 22, 30000));
		listEmployees.add(new MergeListData("Samuel", "Developer", 28, 80000));
		listEmployees.add(new MergeListData("John", "Developer", 35, 67000));
		listEmployees.add(new MergeListData("Patrick", "Developer", 35, 140000));
		listEmployees.add(new MergeListData("Alice", "Programmer", 35, 80000));
		listEmployees.add(new MergeListData("David", "Developer", 35, 99000));
		listEmployees.add(new MergeListData("Jane", "Designer", 30, 82000));
		listEmployees.add(new MergeListData("Tom", "Developer", 45, 80000));

		System.out.println("*** Before sorting:");

		for (MergeListData emp : listEmployees) {
			System.out.println(emp);
		}

/*		Collections.sort(listEmployees, new MergeListDataChainedComparator(
				new JobTitleComparator(), 
				new AgeComparator(),
				new SalaryComparator(),
				new NameComparator()));
*/
		System.out.println("\n*** After sorting:");

		for (MergeListData emp : listEmployees) {
			System.out.println(emp);
		}
	}

}

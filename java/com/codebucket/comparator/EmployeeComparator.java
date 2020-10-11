package com.codebucket.comparator;

import java.util.Comparator;

/**
 * 
 * @author ANRTIWARI
 *
 */
public class EmployeeComparator {

	static class NameComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o1.getName());
		}

	}

	static class IDComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getId() - o2.getId();
		}

	}
}

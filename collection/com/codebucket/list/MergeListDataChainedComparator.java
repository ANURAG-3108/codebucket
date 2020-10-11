package com.codebucket.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeListDataChainedComparator implements Comparator<MergeListData> {
	private List<Comparator<MergeListData>> listComparators;

	@SafeVarargs
	public MergeListDataChainedComparator(Comparator<MergeListData>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(MergeListData emp1, MergeListData emp2) {
		for (Comparator<MergeListData> comparator : listComparators) {
			int result = comparator.compare(emp1, emp2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}

package com.jj.enterprise.ga;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class RecursiveListSum {
	
	private static final RecursiveListSum INSTANCE = new RecursiveListSum();
	private RecursiveListSum() {}
	
	public static final RecursiveListSum getInstance() {
		return INSTANCE;
	}
	
	public int sum(List<Integer> list) {
		if (CollectionUtils.isEmpty(list)) {
			return 0;
		}
		
//		if (list.size() == 1) {
//			return list.get(0);
//		}
		
		return list.remove(0) + sum(list);
	}
}

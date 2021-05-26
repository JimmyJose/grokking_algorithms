package com.jj.enterprise.ga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

public class BreadthFirstSearch {
	
	private static final BreadthFirstSearch INSTANCE = new BreadthFirstSearch();
	private BreadthFirstSearch() {}

	public static BreadthFirstSearch getInstance() {
		return INSTANCE;
	}
	
	public boolean search(Map<String, List<String>> userGraph) {
		if (MapUtils.isEmpty(userGraph)) {
			throw new IllegalArgumentException("Graph is null or empty!");
		}
		
		Queue<String> searchQueue = new LinkedList<>();
		searchQueue.add("you");
		
		Set<String> alreadySearched = new HashSet<>();
		
		String name = null;
		while (!searchQueue.isEmpty()) {
			name = searchQueue.poll();
			if (!alreadySearched.contains(name)) {
				if (isMangoSeller(name)) {
					System.out.println(name + " is a mango seller!");
					return true;
				}
				else {
					searchQueue.addAll(userGraph.get(name));
					alreadySearched.add(name);
				}
			}
		}
		return false;
	}
	
	private boolean isMangoSeller(String name) {
		return StringUtils.isNotBlank(name) && name.endsWith("m");
	}

}

package com.pbw;

//http://www.geeksforgeeks.org/detect-cycle-in-a-graph/

public class Graph {
	Node[] nodes;

	public Graph(int nodeCount) {
		nodes = new Node[nodeCount];
		for (int i = 0; i < nodeCount; ++i) {
			nodes[i] = new Node();
		}
	}

	@SuppressWarnings("unused")
	boolean isCyclicUtil(int v, boolean[] visited) {
		System.out.println("Checking = " + v);
		if (visited[v] == true) {
			System.out.println("Cycle detected at node = " + v);
			return true;
		}
		// Mark the current node as visited
		visited[v] = true;
		// Recurse for all the node adjacent to this node
		for (int i = 0; i < nodes[v].adjacent.size(); i++) {
			return isCyclicUtil(nodes[v].adjacent.get(i), visited);
		}
		return false;
	}

	public void addEdge(int node, int adjacentNode) {
		nodes[node].adjacent.add(adjacentNode);
	}

	public boolean isCyclic() {
		for (int i = 0; i < nodes.length; i++) {
			boolean[] visited = new boolean[nodes.length];
			if (isCyclicUtil(i, visited))
				return true;
		}
		System.out.println("No cycle found");
		return false;
	}
}

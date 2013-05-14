package com.pbw;

//http://www.geeksforgeeks.org/detect-cycle-in-a-graph/

public class Graph {
	Node[] nodes;
	int nodeCount; // No. of vertices

	public Graph(int nodeCount) {
		this.nodeCount = nodeCount;
		nodes = new Node[nodeCount];
		for (int i = 0; i < nodeCount; ++i) {
			nodes[i] = new Node();
		}
	}

	boolean isCyclicUtil(int v, boolean[] visited) {
		System.out.println("Checking = " + v);
		if (visited[v] == true) {
			System.out.println("Cycle detected at node = " + v);
			return true;
		}
		// Mark the current node as visited and part of recursion stack
		visited[v] = true;
		// Recurse for all the vertices adjacent to this vertex
		for (int i = 0; i < nodes[v].adjacent.size(); ++i) {
			return isCyclicUtil(nodes[v].adjacent.get(i), visited);
		}
		return false;
	}

	public void addEdge(int node, int adjacentNode) {
		nodes[node].adjacent.add(adjacentNode);
	}

	public boolean isCyclic() {
		for (int i = 0; i < nodeCount; i++) {
			// Mark all the vertices as not visited
			boolean[] visited = new boolean[nodeCount];
			if (isCyclicUtil(i, visited))
				return true;
		}
		System.out.println("No cycle found");
		return false;
	}
}

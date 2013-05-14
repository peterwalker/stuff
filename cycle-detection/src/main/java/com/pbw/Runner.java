package com.pbw;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		isCycle1();
		isCycle2();
		isCycle3();
		noCycle();
	}

	static void isCycle1() {
		// Create a graph given in the above diagram
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		if (g.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");
	}

	static void isCycle2() {
		// Create a graph given in the above diagram
		Graph g = new Graph(2);
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		if (g.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");
	}

	static void isCycle3() {
		// Create a graph given in the above diagram
		Graph g = new Graph(2);
		g.addEdge(0, 1);
		g.addEdge(1, 1);
		if (g.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");
	}

	static void noCycle() {
		// Create a graph given in the above diagram
		Graph g = new Graph(3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		if (g.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");
	}
}
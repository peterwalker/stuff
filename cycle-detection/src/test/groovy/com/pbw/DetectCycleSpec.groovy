package com.pbw

import spock.lang.Specification


class DetectCycleSpec extends Specification {
	def "no cycle" (){
		when:
		Graph g = new Graph(3)
		g.addEdge(0, 1)
		g.addEdge(0, 2)
		g.addEdge(1, 2)

		then:
		g.isCyclic() == false
	}

	def "cycle self reference" (){
		when:
		Graph g = new Graph(2);
		g.addEdge(0, 1);
		g.addEdge(1, 1);

		then:
		g.isCyclic() == true
	}

	def "simple cycle" (){
		when:
		Graph g = new Graph(2);
		g.addEdge(0, 1);
		g.addEdge(1, 0);

		then:
		g.isCyclic() == true
	}

	def "cycles" (){
		when:
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		then:
		g.isCyclic() == true
	}
}

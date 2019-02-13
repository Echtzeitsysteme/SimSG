package org.simsg.development;

import java.util.Random;
import java.util.function.Supplier;

import org.jgrapht.*;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm.SpanningTree;
import org.jgrapht.alg.spanning.PrimMinimumSpanningTree;
import org.jgrapht.graph.SimpleWeightedGraph;

public class NetworkGenerator {
	
	private int numOfNodes;
	private NetworkType type;
	private String networkName;
	
	private Graph<Vertex, Edge> graph = new SimpleWeightedGraph<Vertex, Edge>(Edge.class);
	
	Random rnd = new Random();
	
	public NetworkGenerator(String networkName, NetworkType type, int numOfNodes) {
		this.networkName = networkName;
		this.type = type;
		this.numOfNodes = numOfNodes;
	}
	
	public void buildNetwork() {
		switch(type) {
		case FullMesh:
			buildFullMesh();
			return;
		case MinimalSpanningTree:
			buildMinimalSpanning();
			return;
		}
	}
	
	private void generateSimSGLModel() {
		
	}
	
	private void buildFullMesh() {
		for(int i = 0; i<numOfNodes; i++) {
			Vertex v = new Vertex("Node"+i);
			graph.addVertex(v);
		}
		
		for(Vertex v : graph.vertexSet()) {
			for(Vertex v2 : graph.vertexSet()) {
				if(v==v2) continue;
				Edge e = new Edge(v, v2, rnd.nextDouble()*100.0);
				graph.addEdge(v, v2, e);
			}
		}
	}

	private void buildMinimalSpanning() {
		buildFullMesh();
		SpanningTreeAlgorithm<Edge> spanning = new PrimMinimumSpanningTree<Vertex, Edge>(graph);
		SpanningTree<Edge> tree = spanning.getSpanningTree();
		graph.edgeSet().clear();
		for(Edge e : tree.getEdges()) {
			graph.addEdge(e.src, e.trg, e);
		}
	}
}

enum NetworkType {
	FullMesh("FullMesh"), MinimalSpanningTree("MinimalSpanningTree");
	
	private String name;
	
	NetworkType(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class Vertex {
	public final String name;
	
	public Vertex(String name) {
		this.name = name;
	}
}

class Edge implements Supplier<Double> {
	public final Vertex src;
	public final Vertex trg;
	public final double weight;
	
	public Edge(Vertex src, Vertex trg, double weight) {
		this.src = src;
		this.trg = trg;
		this.weight = weight;
	}

	@Override
	public Double get() {
		return weight;
	}
}

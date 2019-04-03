package org.simsg.examples.network.generator;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import org.jgrapht.*;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm.SpanningTree;
import org.jgrapht.alg.spanning.PrimMinimumSpanningTree;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.simsg.examples.network.generator.SimSGLGenerator;

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
	
	public void generateSimSGLModel() {
		SimSGLGenerator.generateCode(graph, networkName);
	}
	
	private void buildFullMesh() {
		for(int i = 0; i<numOfNodes; i++) {
			Vertex v = new Vertex("Node"+i);
			graph.addVertex(v);
		}
		int n = 0;
		Set<Edge> edges = new HashSet<>();
		for(Vertex v : graph.vertexSet()) {
			for(Vertex v2 : graph.vertexSet()) {
				if(v==v2) continue;
				Edge e = new Edge("Edge"+n, v, v2, rnd.nextDouble()*100.0);
				if(edges.contains(e)) continue;
				
				graph.addEdge(v, v2, e);
				e.finalizeSrcTrg();
				edges.add(e);
				n++;
			}
		}
	}

	private void buildMinimalSpanning() {
		for(int i = 0; i<numOfNodes; i++) {
			Vertex v = new Vertex("Node"+i);
			graph.addVertex(v);
		}
		int n = 0;
		Set<Edge> edges = new HashSet<>();
		for(Vertex v : graph.vertexSet()) {
			for(Vertex v2 : graph.vertexSet()) {
				if(v==v2) continue;
				Edge e = new Edge("Edge"+n, v, v2, rnd.nextDouble()*100.0);
				if(edges.contains(e)) continue;
				
				graph.addEdge(v, v2, e);
				edges.add(e);
				n++;
			}
		}
		
		SpanningTreeAlgorithm<Edge> spanning = new PrimMinimumSpanningTree<Vertex, Edge>(graph);
		SpanningTree<Edge> tree = spanning.getSpanningTree();
		graph.removeAllEdges(new HashSet<Edge>(graph.edgeSet()));
		for(Edge e : tree.getEdges()) {
			graph.addEdge(e.src, e.trg, e);
			e.finalizeSrcTrg();
		}
	}
}



class Vertex {
	public final String name;
	
	public Set<Integer> edges = new HashSet<>();
	
	public Vertex(String name) {
		this.name = name;
	}
}

class Edge implements Supplier<Double> {
	public final String name;
	public final Vertex src;
	public final Vertex trg;
	public final double weight;
	
	public int sIdx = 0;
	public int tIdx = 0;
	
	private static int idx = 0;
	
	public Edge(String name, Vertex src, Vertex trg, double weight) {
		this.name = name;
		this.src = src;
		this.trg = trg;
		this.weight = weight;
	}
	
	public void finalizeSrcTrg() {
		sIdx = idx;
		idx++;
		tIdx = idx;
		idx++;
		src.edges.add(sIdx);
		trg.edges.add(tIdx);
	}

	@Override
	public Double get() {
		return weight;
	}
	
	@Override
	public int hashCode() {
		int fwd = Objects.hash(src, trg);
		int bwd = Objects.hash(trg, src);
		return (fwd>bwd)?fwd:bwd;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Edge)) return false;
		Edge other = (Edge)obj;
		return (src==other.src && trg==other.trg) || (src==other.trg && trg==other.src);
	}
}

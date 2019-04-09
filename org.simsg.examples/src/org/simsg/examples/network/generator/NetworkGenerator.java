package org.simsg.examples.network.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
import org.jgrapht.*;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm.SpanningTree;
import org.jgrapht.alg.spanning.PrimMinimumSpanningTree;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.simsg.examples.network.ComputerNetwork.ComputerNetworkFactory;
import org.simsg.examples.network.ComputerNetwork.GeometricNode;
import org.simsg.examples.network.ComputerNetwork.Link;
import org.simsg.examples.network.ComputerNetwork.Network;
import org.simsg.examples.network.ComputerNetwork.Node;
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
	
	public void buildNetwork(double maxWeight) {
		generateGenericVertices();
		
		switch(type) {
		case FullMesh:
			buildFullMesh(maxWeight);
			return;
		case MinimalSpanningTree:
			buildMinimalSpanning(maxWeight);
			return;
		}
	}
	
	public void buildNetwork(double mX, double mY, double mZ) {
		generateGeometricVertices(mX, mY, mZ);
		
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
	
	public void generateNetworkModel(String path) {
		ComputerNetworkFactory factory = ComputerNetworkFactory.eINSTANCE;
		Network network = factory.createNetwork();
		network.setName(networkName);
		
		Map<Vertex, Node> nodes  = new HashMap<>();
		for(Vertex v : graph.vertexSet()) {
			Node n = null;
			if(v instanceof GeometricVertex) {
				n = factory.createGeometricNode();
				GeometricNode gn = (GeometricNode)n;
				gn.setX(((GeometricVertex) v).x);
				gn.setY(((GeometricVertex) v).y);
				gn.setZ(((GeometricVertex) v).z);
			}else {
				n = factory.createSimpleNode();
			}
			n.setName(v.name);
			nodes.put(v, n);
		}
		
		Map<Edge, Link> links = new HashMap<>();
		for(Edge e : graph.edgeSet()) {
			Link l = factory.createLink();
			l.setWeight(e.weight);
			l.getEndpoints().add(nodes.get(e.src));
			l.getEndpoints().add(nodes.get(e.trg));
			links.put(e, l);
		}
		
		network.getNodes().addAll(nodes.values());
		network.getLinks().addAll(links.values());
		
		saveModel(network, path);
	}
	
	private static void saveModel(Network network, String path) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("SimulationModel", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		URI uri = URI.createFileURI(path);
		System.out.println(uri.toString());
		Resource modelResource = rs.createResource(uri);
		modelResource.getContents().add(network);
		
		Map<Object, Object> saveOptions = ((XMIResource)modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		try {
			((XMIResource)modelResource).save(saveOptions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Model saved to: "+uri.path());
	}
	
	public void displayModel() {
		org.graphstream.graph.Graph gs = new MultiGraph("networkName");
		Map<Vertex, org.graphstream.graph.Node> vertices  = new HashMap<>();
		for(Vertex v : graph.vertexSet()) {
			org.graphstream.graph.Node node = gs.addNode(v.name);
			vertices.put(v, node);
			node.addAttribute("ui.style", "fill-color: rgb(255,100,000); text-size: 12; size: 20px; text-style: bold;");
			node.addAttribute("ui.label", "Node:"+v.name);
			if(v instanceof GeometricVertex) {
				GeometricVertex gv = (GeometricVertex)v;
				node.addAttribute("xyz", gv.x, gv.y, gv.z);
			}
		}
		for(Edge e : graph.edgeSet()) {
			org.graphstream.graph.Edge edge = gs.addEdge(e.name, vertices.get(e.src), vertices.get(e.trg));
			edge.addAttribute("ui.label", "Weight:"+e.weight);
		}
		Viewer v = gs.display();
		v.disableAutoLayout();
	}
	
	private void generateGenericVertices() {
		for(int i = 0; i<numOfNodes; i++) {
			Vertex v = new Vertex("Node"+i);
			graph.addVertex(v);
		}
	}
	
	private void generateGeometricVertices(double mX, double mY, double mZ) {
		for(int i = 0; i<numOfNodes; i++) {
			GeometricVertex v = new GeometricVertex("Node"+i);
			v.x = rnd.nextDouble()*mX;
			v.y = rnd.nextDouble()*mY;
			v.z = rnd.nextDouble()*mZ;
			graph.addVertex(v);
		}
	}
	
	private Edge generateGenericEdge(double index, Vertex v1, Vertex v2, double maxWeight) {
		Edge e = new Edge("Edge"+index, v1, v2, rnd.nextDouble()*maxWeight);
		return e;
	}
	
	private Edge generateGeometricEdge(double index, GeometricVertex v1, GeometricVertex v2) {
		double dX = Math.pow(v1.x-v2.x,2);
		double dY = Math.pow(v1.y-v2.y,2);
		double dZ = Math.pow(v1.z-v2.z,2);
		
		Edge e = new Edge("Edge"+index, v1, v2, Math.sqrt(dX+dY+dZ));
		return e;
	}
	
	private void buildFullMesh() {
		int n = 0;
		Set<Edge> edges = new HashSet<>();
		for(Vertex v : graph.vertexSet()) {
			for(Vertex v2 : graph.vertexSet()) {
				if(v==v2) continue;
				Edge e = generateGeometricEdge(n, (GeometricVertex)v, (GeometricVertex)v2);
				if(edges.contains(e)) continue;
				
				graph.addEdge(v, v2, e);
				e.finalizeSrcTrg();
				edges.add(e);
				n++;
			}
		}
	}
	
	private void buildFullMesh(double maxWeight) {
		int n = 0;
		Set<Edge> edges = new HashSet<>();
		for(Vertex v : graph.vertexSet()) {
			for(Vertex v2 : graph.vertexSet()) {
				if(v==v2) continue;
				Edge e = generateGenericEdge(n, v, v2, maxWeight);
				if(edges.contains(e)) continue;
				
				graph.addEdge(v, v2, e);
				e.finalizeSrcTrg();
				edges.add(e);
				n++;
			}
		}
	}
	
	private void buildMinimalSpanning() {
		int n = 0;
		Set<Edge> edges = new HashSet<>();
		for(Vertex v : graph.vertexSet()) {
			for(Vertex v2 : graph.vertexSet()) {
				if(v==v2) continue;
				Edge e = generateGeometricEdge(n, (GeometricVertex)v, (GeometricVertex)v2);
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

	private void buildMinimalSpanning(double maxWeight) {
		int n = 0;
		Set<Edge> edges = new HashSet<>();
		for(Vertex v : graph.vertexSet()) {
			for(Vertex v2 : graph.vertexSet()) {
				if(v==v2) continue;
				Edge e = generateGenericEdge(n, v, v2, maxWeight);
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

class GeometricVertex extends Vertex{
	public double x, y, z;
	
	public GeometricVertex(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public GeometricVertex(String name, double x, double y, double z) {
		super(name);
		this.x = x;
		this.y = y;
		this.z = z;
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

package org.simsg.examples.network.generator;

public enum NetworkType {
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
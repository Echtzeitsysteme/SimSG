package org.simsg.development

import java.nio.file.Files
import java.nio.file.Paths
import java.util.Arrays
import org.jgrapht.Graph

class SimSGLGenerator {
	final static String folder = "models/SimSGLModels/"
	
	static def saveModel(String networkName, String content) {
		Files.createDirectories(Paths.get(folder))
		save(folder + networkName, content)
	}
	
	private static def save(String path, String content) {
		Files.write(Paths.get(path + ".ssgl"), Arrays.asList(content))
	}
	
	static def generateCode(Graph<Vertex, Edge> graph, String networkName) {
		val content = '''ModelID «networkName»
		
agent Node(*port)
agent Edge(*port){active, inactive, deleted, added}[weight:FLOAT]
		
init n1 1 { 
			«FOR vertex : graph.vertexSet»
			«vertex.name»:Node(port*[«FOR edge : vertex.edges SEPARATOR ","»«edge»«ENDFOR»]),
			«ENDFOR»
			«FOR edge : graph.edgeSet SEPARATOR ","»
			«edge.name»:Edge(port*[«edge.sIdx»,«edge.tIdx»]){active}
			«ENDFOR»
		}
		[
			«FOR edge : graph.edgeSet SEPARATOR ","»
			«edge.name».weight=«edge.weight»
			«ENDFOR»
		]
		
		// Stochastic rules simulating a dynamic environment
		
		rule increaseWeight {E1:Edge()} -> {E1:Edge()} [E1.weight = E1.weight+1] @ [0.025]
		
		rule decreaseWeight {E1:Edge()}[E1.weight > 1] -> {E1:Edge()} [E1.weight = E1.weight-1] @ [0.025]
		
		rule deleteEdgeActive {Edge(){active}} -> {Edge(){deleted}} @ [0.004]
		
		rule deleteEdgeInactive {Edge(){inactive}} -> {Edge(){deleted}} @ [0.004]
		
		var addPattern = {Node(port*[?]), Node(port*[?]), void}
		
		rule addEdge1 addPattern -> {Node(port*[1]), Node(port*[2]), E1:Edge(port*[1,2]){added}} [E1.weight = 1] @ [0.0004]
		rule addEdge2 addPattern -> {Node(port*[1]), Node(port*[2]), E1:Edge(port*[1,2]){added}} [E1.weight = 2] @ [0.0004]
		rule addEdge3 addPattern -> {Node(port*[1]), Node(port*[2]), E1:Edge(port*[1,2]){added}} [E1.weight = 3] @ [0.0004]
		rule addEdge4 addPattern -> {Node(port*[1]), Node(port*[2]), E1:Edge(port*[1,2]){added}} [E1.weight = 5] @ [0.0004]
		rule addEdge5 addPattern -> {Node(port*[1]), Node(port*[2]), E1:Edge(port*[1,2]){added}} [E1.weight = 8] @ [0.0004]
		
		// Rules of the kTC Algorithm
		
		rule a_removeRedundantAdded {Node(port*[1,3]), Node(port*[2,4]), Edge(port*[1,2]){added}, Edge(port*[3,4])} -> 
			{Node(port*[1]), Node(port*[2]), void, Edge(port*[1,2])}
			
		rule b_cleadAdded {Edge(){added}} -> {Edge(){inactive}}
		
		rule c_kTC_repairTwo {
			Node(port*[1,6]), Node(port*[2,3]), Node(port*[4,5]),
			Edge(port*[1,2]){inactive}, E2:Edge(port*[3,4]){inactive}, E3:Edge(port*[5,6]){deleted}
		}
		->
		{
			Node(port*[1,6]), Node(port*[2,3]), Node(port*[4,5]),
			Edge(port*[1,2]){active}, E2:Edge(port*[3,4]){active}, E3:Edge(port*[5,6]){deleted}
		}
		
		rule d_kTC_repairOne {
			Node(port*[1,6]), Node(port*[2,3]), Node(port*[4,5]),
			Edge(port*[1,2]){inactive}, E2:Edge(port*[3,4]){active}, E3:Edge(port*[5,6]){deleted}
		}
		->
		{
			Node(port*[1,6]), Node(port*[2,3]), Node(port*[4,5]),
			Edge(port*[1,2]){active}, E2:Edge(port*[3,4]){active}, E3:Edge(port*[5,6]){deleted}
		}
		
		rule e_cleanDeleted {Edge(){deleted}} -> {void}
		
		rule f_kTC_powerUp {
			N1:Node(port*[1,6]), N2:Node(port*[2,3]), N3:Node(port*[4,5]),
			E1:Edge(port*[1,2]), E2:Edge(port*[3,4]), E3:Edge(port*[5,6]){inactive}
		} [E1.weight + E2.weight > E3.weight]
			-> 
		{
			N1:Node(port*[1,6]), N2:Node(port*[2,3]), N3:Node(port*[4,5]),
			E1:Edge(port*[1,2]), E2:Edge(port*[3,4]), E3:Edge(port*[5,6]){active}
		}
		
		rule g_kTC_powerDown {
			N1:Node(port*[1,6]), N2:Node(port*[2,3]), N3:Node(port*[4,5]),
			E1:Edge(port*[1,2]){active}, E2:Edge(port*[3,4]){active}, E3:Edge(port*[5,6]){active}
		} [E1.weight + E2.weight <= E3.weight]
			->
		{
			N1:Node(port*[1,6]), N2:Node(port*[2,3]), N3:Node(port*[4,5]),
			E1:Edge(port*[1,2]){active}, E2:Edge(port*[3,4]){active}, E3:Edge(port*[5,6]){inactive}
		}
		
		obs activeEdges {Edge(){active}}
		obs inactiveEdges {Edge(){inactive}}
		obs deletedEdges {Edge(){deleted}}
		obs addedEdges {Edge(){added}}
		obs edges {Edge()}
		obs triangles {
			N1:Node(port*[1,6]), N2:Node(port*[2,3]), N3:Node(port*[4,5]),
			E1:Edge(port*[1,2]){active}, E2:Edge(port*[3,4]){active}, E3:Edge(port*[5,6]){active}
		}[N1.id < N2.id, N2.id < N3.id]
		
		terminate end time=3600000
		terminate end1 iterations=1'''
		
		saveModel(networkName, content)
	}
	
}
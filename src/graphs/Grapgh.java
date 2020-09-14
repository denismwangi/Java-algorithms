package graphs;

/***
 * 
 * @author denniske 13/9/2020
 *
 */

class Vertex{
	
	public char label; //label eg city
	public boolean Visited;
	
	//constructor
	public Vertex(char lab) {
		label = lab;
		Visited = false;
	}
}

public class Grapgh {
	
	private final int MAX_VERTS = 20;
	
	private  Vertex vertexList[] ;  //array of vertexs
	private int adjMat[][];   //adjacent matrix
	private int verts;  //current number o vertices
	
	//constructor
	public Grapgh() {
		vertexList = new Vertex[MAX_VERTS];
		//adjacent matrix
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		verts = 0;
		for(int j = 0; j < MAX_VERTS; j++)  //set adjacency to 0
			for(int k = 0; k<MAX_VERTS; k++)
				adjMat[j][k] = 0;
		
	}
	public void addVertex(char lab)  //urgument is label
	{
		vertexList[verts++] = new Vertex(lab);
		
	}
	
	public void DisplayVertex(int v) {
		System.out.println(vertexList[v].label);
	}
	public void addEdge( int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
		
	}
	
	
}

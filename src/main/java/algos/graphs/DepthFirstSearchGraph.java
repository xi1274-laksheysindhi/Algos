package algos.graphs;


import java.util.Iterator;

/*
In depth first search  if we start from 2 then we will take linked list associated with 2
print take first from that list and then go to its child recursively till end
and a while loop to iterate all child in linkedlist associated with 2
 */

public class DepthFirstSearchGraph {

    void dfs(int from, boolean[] visited, GraphRepresentation.Graph graph) {
    visited[from] = true;
    System.out.println(from);
    Iterator i = graph.adjacencyList[from].listIterator();
            while(i.hasNext()) {
                int n = (int)i.next();
                if(!visited[n]) {
                 dfs(n,visited,graph);
                }
            }


    }

    public void dfs(GraphRepresentation.Graph graph, int from) {

        boolean[] visited = new boolean[graph.vertex];
        dfs(from, visited, graph);

    }

    public static void main(String[] args) {
        GraphRepresentation.Graph g = new GraphRepresentation.Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        DepthFirstSearchGraph dfs =new DepthFirstSearchGraph();
        dfs.dfs(g,2);
    }
}
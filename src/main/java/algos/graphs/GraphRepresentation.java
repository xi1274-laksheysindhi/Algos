package algos.graphs;

import java.util.LinkedList;
import java.util.List;

public class GraphRepresentation {

    static class Graph {

        int vertex;
        LinkedList<Integer> adjacencyList[];

        Graph(int vertex) {
            this.vertex = vertex;
            adjacencyList = new LinkedList[vertex];
            for(int i = 0; i < vertex; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int destination) {
            adjacencyList[src].add(destination);

            adjacencyList[destination].add(src);
        }

         void printGraph()
        {
            for(int v = 0; v < vertex; v++)
            {
                System.out.println("Adjacency list of vertex "+ v);
                System.out.print("head");
                for(Integer pCrawl: adjacencyList[v]){
                    System.out.print(" -> "+pCrawl);
                }
                System.out.println("\n");
            }
        }


    }

public static void main(String arg[]) {
        Graph g = new Graph(5);
    g.addEdge( 0, 1);
    g.addEdge( 0, 4);
    g.addEdge( 1, 2);
    g.addEdge( 1, 3);
    g.addEdge( 1, 4);
    g.addEdge( 2, 3);
    g.addEdge( 3, 4);
    g.printGraph();
}


}

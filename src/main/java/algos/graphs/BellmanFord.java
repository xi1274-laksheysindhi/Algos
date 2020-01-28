package algos.graphs;

class Graph {
    // A class to represent a weighted edge in graph
    class Edge {
        int src, dest, weight;

        Edge() {
            src = dest = weight = 0;
        }
    }

    ;

    int V, E;
    Edge edge[];

    // Creates a graph with V vertices and E edges
    Graph(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }


}

/*
In this we do iterations number of vertex time -1 suppose 4 then 4-1
in each above iteration we will iterate all the edges and relax

we will maintain one array of all vertices
initate all by Integer.max
and start as 0
when doing relaxation of every edge

Relaxation mean Check src to dest weight
check arr[src]+weight of edge < arr[dest]

after competion of this loops check for negative cycle
negative cycle is graph which is in cycle and total sum is -ve

 */


public class BellmanFord {


    public int[] bellmanFord(Graph graph, int vertex) {

        int[] distance = new int[graph.V];

        distance[0] = 0;
        for(int i=1; i < distance.length ; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for(int j = 0; j <= graph.V-1; j++) {
            for(int i =0; i< graph.edge.length; i++) {
                int src = graph.edge[i].src;
                int dest = graph.edge[i].dest;
                int weight = graph.edge[i].weight;
                if(distance[src] != Integer.MAX_VALUE && weight + distance[src] < distance[dest]) {
                    distance[dest] = weight + distance[src];
                }
            }
        }

        for(int i =0; i< graph.edge.length; i++) {
            int src = graph.edge[i].src;
            int dest = graph.edge[i].dest;
            int weight = graph.edge[i].weight;
            if(distance[src] != Integer.MAX_VALUE && weight + distance[src] < distance[dest]) {
                distance[dest] = weight + distance[src];
            }
        }
      return distance;

    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices in graph
        int E = 8; // Number of edges in graph

        Graph graph = new Graph(V, E);
        BellmanFord bellmanFord = new BellmanFord();

        // add edge 0-1 (or A-B in above figure)
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -1;

        // add edge 0-2 (or A-C in above figure)
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 4;

        // add edge 1-2 (or B-C in above figure)
        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 3;

        // add edge 1-3 (or B-D in above figure)
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 2;

        // add edge 1-4 (or A-E in above figure)
        graph.edge[4].src = 1;
        graph.edge[4].dest = 4;
        graph.edge[4].weight = 2;

        // add edge 3-2 (or D-C in above figure)
        graph.edge[5].src = 3;
        graph.edge[5].dest = 2;
        graph.edge[5].weight = 5;

        // add edge 3-1 (or D-B in above figure)
        graph.edge[6].src = 3;
        graph.edge[6].dest = 1;
        graph.edge[6].weight = 1;

        // add edge 4-3 (or E-D in above figure)
        graph.edge[7].src = 4;
        graph.edge[7].dest = 3;
        graph.edge[7].weight = -3;

        System.out.println(bellmanFord.bellmanFord(graph, 0));
    }
}
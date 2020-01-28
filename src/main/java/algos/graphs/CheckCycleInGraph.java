package algos.graphs;

import java.util.LinkedList;

/*
In identifying cycle in graph we dfs need to be done
 */
public class CheckCycleInGraph {

    public static int V;
    private LinkedList<Integer> adj[];

    private boolean isCyclic(int edge, boolean[] visited, int parent) {

        visited[edge] = true;
        boolean hasCycle = false;
        LinkedList<Integer> starting = adj[edge];
        for(int i = 0; i < starting.size(); i++) {
            if(visited[edge] == false) {
                hasCycle = isCyclic(starting.get(i), visited, edge);

            } else if(edge != parent) {
                hasCycle = true;
            }
        }

        return hasCycle;
    }

    CheckCycleInGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public static void main(String args[])
    {
        CheckCycleInGraph g1 = new CheckCycleInGraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);


        boolean[] visited =new boolean[V];
        if (g1.isCyclic(0, visited, -1))
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }
}

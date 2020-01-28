package algos.graphs;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
In breadth first search  if we start from 2 then we will take linked list associated with 2
print and add to queue then take first from that queue print and add elements to its cors list to queue will perform same till queue is empty.

 */

public class BreadthFirstSearchGraph {

    public void bfs(GraphRepresentation.Graph graph, int from) {
        boolean[] visited = new boolean[graph.vertex];
        visited[from] = true;

        Queue queue = new LinkedList();
        queue.add(from);
        System.out.println(from);

        while (!queue.isEmpty()) {
            int i = (int) queue.poll();
            Iterator z = graph.adjacencyList[i].listIterator();

            while (z.hasNext()) {
                int y = (int) z.next();
                if (!visited[y]) {
                    visited[y] = true;
                    System.out.println(y);
                    queue.add(y);
                }
            }
        }

    }

    public static void main(String[] args) {
        GraphRepresentation.Graph g = new GraphRepresentation.Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        BreadthFirstSearchGraph bfs = new BreadthFirstSearchGraph();
        bfs.bfs(g, 2);
    }
}

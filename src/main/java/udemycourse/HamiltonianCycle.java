//package udemycourse;
//
//public class HamiltonianCycle {
//
////    boolean isValid(int[][] graph, int start, int[] path) {
////
////        if()
////
////    }
//
//    boolean hamCycle(int[][] graph, int start, int[] path) {
//        if(start >=5) {
//            return true;
//        }
//        for(int i = 0; i < graph.length; i++) {
//            if (isValid(graph, start, path)) {
//                path[i] = i;
//                hamCycle(graph, start+1, )
//            }
//
//        }
//
//
//    }
//
//    public static void main(String args[]) {
//        HamiltonianCycle hamiltonian =
//                new HamiltonianCycle();
//        /* Let us create the following graph
//           (0)--(1)--(2)
//            |   / \   |
//            |  /   \  |
//            | /     \ |
//           (3)-------(4)    */
//        int graph1[][] = {{0, 1, 0, 1, 0},
//                {1, 0, 1, 1, 1},
//                {0, 1, 0, 0, 1},
//                {1, 1, 0, 0, 1},
//                {0, 1, 1, 1, 0},
//        };
//
//        // Print the solution
//        int[] path = new int[5];
//        hamiltonian.hamCycle(graph1, 0, path);
//    }
//}

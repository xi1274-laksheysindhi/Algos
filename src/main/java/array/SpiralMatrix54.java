package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[][] matrix = new int[][]{
                {1, 2, 3, 4,},
                {6, 7, 8, 9},
                {10,11, 12, 13},
                {14, 15, 16, 17},

        };
        int columnWise = matrix.length;
        int rowWise = matrix[0].length;

        spiralOrder(matrix, columnWise, rowWise, list, 0, 0);
    }

    public static List<Integer> spiralOrder(int[][] matrix, int columnWise, int rowwise, List list, int column, int row) {
        int i;
        int j;
        for(i = column; i < columnWise; i++) {
            list.add(matrix[row][i]);
        }
        for(j = row; j < rowwise; j++) {
            list.add(matrix[j][i-1]);
        }
        for(j = columnWise-1; j >= column; j--) {
            list.add(matrix[j-1][i-1]);
        }
        for(j = rowwise-1; j >= rowwise; j--) {
            list.add(matrix[j-1][i-1]);
        }

        return spiralOrder(matrix, columnWise+1, rowwise, list, column+1, row+1);
    }

    }

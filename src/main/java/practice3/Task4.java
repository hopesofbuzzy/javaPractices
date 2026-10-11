package practice3;

public class Task4 {
    static void main() {
//        int[][] matrix = new int[][]{
//                new int[]{1, 2, 3, 4, 5},
//                new int[]{6, 7, 8, 9, 10},
//                new int[]{11, 12, 13, 14, 15},
//                new int[]{16, 17, 18, 19, 20},
//                new int[]{21, 22, 23, 24, 25},
//        };
        int[][] matrix = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9},
        };
        int colMoves = matrix.length;
        int rowMoves = matrix.length;

        int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int dir = 0;
        int row = -1;
        int col = 0;
        while (colMoves != 0 && rowMoves != 0) {
            for (int i = 0; i < colMoves; i++) {
                row += directions[dir][0];
                System.out.printf("%d ", matrix[row][col]);
            }
            dir = ((dir + 1) < 4) ? dir + 1 : 0;
            System.out.println("");
            rowMoves -= 1;
            for (int i = 0; i < rowMoves; i++) {
                col += directions[dir][1];
                System.out.printf("%d ", matrix[row][col]);
            }
            dir = ((dir + 1) < 4) ? dir + 1 : 0;
            colMoves -= 1;
            System.out.println("");
        }
    }
}

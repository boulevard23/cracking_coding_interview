package cse.buffalo.edu.arrays_strings;

public class ZeroRowColumn {
  private boolean[] row;
  private boolean[] col;
  private int[][] matrix;

  public ZeroRowColumn(int[][] matrix) {
    this.matrix = matrix;
    row = new boolean[matrix.length];
    col = new boolean[matrix[0].length];
  }

  public int[][] resetMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          row[i] = true;
          col[j] = true;
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (row[i] || col[j]) {
          matrix[i][j] = 0;
        }
      }
    }

    return matrix;
  }

  public static void main(String[] args) {
    int[][] matrix = new int[][] {
      {1, 0, 1, 1},
      {1, 1, 0, 1},
      {1, 1, 1, 1}
    };

    ZeroRowColumn zrc = new ZeroRowColumn(matrix);
    matrix = zrc.resetMatrix();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}

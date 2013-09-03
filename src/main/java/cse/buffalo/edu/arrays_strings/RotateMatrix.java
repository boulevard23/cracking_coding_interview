package cse.buffalo.edu.arrays_strings;

public class RotateMatrix {
  private int[][] matrix;

  public RotateMatrix(int[][] matrix) {
    this.matrix = matrix;
  }

  public int[][] rotate() {
    int N = matrix.length;
    for (int layer = 0; layer < N; layer++) {
      int first = layer;
      int last = N - 1 - layer;

      for (int i = first; i < last; i++) {
        int offset = i - first;

        int top = matrix[first][i];

        matrix[first][i] = matrix[last - offset][first];

        matrix[last - offset][first] = matrix[last][last - offset];

        matrix[last][last - offset] = matrix[i][last];

        matrix[i][last] = top;
      }
    }
    return matrix;
  }
}

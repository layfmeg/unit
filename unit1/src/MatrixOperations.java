public class MatrixOperations {

    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }

        int rowCount = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rowCount) {
                return false;
            }
        }

        return true;
    }
}

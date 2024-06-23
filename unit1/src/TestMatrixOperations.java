public class TestMatrixOperations {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = MatrixOperations.calculateAverage(array);
        System.out.println("Середнє арифметичне елементів масиву: " + average);
        
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        boolean isSquare = MatrixOperations.isSquareMatrix(squareMatrix);
        System.out.println("Матриця квадратна: " + isSquare);

        isSquare = MatrixOperations.isSquareMatrix(nonSquareMatrix);
        System.out.println("Матриця квадратна: " + isSquare);
    }
}

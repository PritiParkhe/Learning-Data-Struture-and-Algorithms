
public class Basics2DArray {

    public static void main(String[] args) {
        // D.Multidimentional Arrays
        // 1. Declaration and Initialization
        // type[][] arrayName = new type[rows][columns];
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //2. Accessing Elements
        System.out.println(matrix[1][2]); // Output: 6

        // Iterating Through a 2D Array 
        for(int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}

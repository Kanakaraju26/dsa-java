package medium;

public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse the row 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }

    }
    public static void main(String[] args) {
        rotate(new int[][] {{3,2,1},{6,4,5},{9,8,7}});
    }
}

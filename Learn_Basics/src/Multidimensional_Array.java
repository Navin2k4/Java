public class Multidimensional_Array {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        matrix[0][0] = 50;
        matrix[1][2] = 20;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matrix[i][j] + "\t");
            }
        }
    }
}

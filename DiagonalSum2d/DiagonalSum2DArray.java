public class DiagonalSum2DArray {
    public static void main(String[] arrgs) {
        int[][] num = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9},};
        //DiagonalSum(num);
        Spiralprint(num);

    }

    public static void DiagonalSum(int[][] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i][i];
            if (i != num.length - 1 - i) {
                sum += num[i][num.length - i - 1];
            }
        }
        System.out.println(sum);
    }

    public static void Spiralprint(int[][] num) {
        int StartColumn = 0, EndColumn = num[0].length - 1, StartRow = 0, EndRow = num.length - 1;
        while (StartColumn <= EndColumn && StartRow <= EndRow) {
            for (int i = StartColumn; i <= EndColumn; i++) {
                System.out.print(" ,"+num[StartRow][i]);
            }
            for(int i=StartRow+1;i<=EndRow;i++) {
                System.out.print(","+num[i][EndColumn]);
            }
            for(int j=EndColumn-1;j>=StartColumn;j--)
            {
                if(EndRow==StartRow)
                {
                    return;
                }
                System.out.print(","+num[EndRow][j]);
            }
            for(int j=EndRow-1;j>=StartRow+1;j--)
            {
                if(StartColumn==EndColumn)
                {
                    return;
                }
                System.out.print(","+num[j][StartColumn]);
            }
        EndRow--;EndColumn--;StartRow++;StartColumn++;


}
    }
        }
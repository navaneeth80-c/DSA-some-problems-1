public class TransposeOfAMatrix {
    public static void main(String[] arrgs)
    {
        int[][] num={{1,2},{3,4},{5,6},{7,8},{9,10}};
        System.out.println("before");
        for(int i=0;i<num.length;i++)
        {
            for(int j=0; j<num[0].length;j++)
            {
                System.out.print(num[i][j]+" ,");
            }
            System.out.println();
        }
        System.out.println("after the transpose");
        for(int i=0;i<num[0].length;i++)
        {
            for(int j=0;j<num.length;j++)
            {
                System.out.print(num[j][i]+" ,");
            }
            System.out.println();
        }
    }
}

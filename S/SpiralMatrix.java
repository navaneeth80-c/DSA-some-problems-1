public class SpiralMatrix {
    public static void main(String[] arrgs)
    {
        int[][] num={{1,2,3,6,7},
                     {5,6,7,5,8},
                     {9,10,13,6,9},
                     {9,10,13,6,9},
                     {9,10,13,6,9},  };
        Spiral2(num);
    }
       /*  StartColumn
              |          |
              |          |
              v          |
StartRow----->1  2  3    4
              5  6  7    8
EndRow------>9  10  11  12  */


    public static void SpiralPrint(int[][] num)
    {
        int StartColumn=0;
        int EndColumn= num.length-1;
        int StartRows=0;
        int EndRows=num[0].length-1;
        while (StartRows<=EndRows && StartColumn<= EndColumn)
        {
            //top.
           for(int i=StartColumn;i<=EndColumn;i++)
           {
               System.out.print(num[StartRows][i]+",");
           }
           //right.
           for(int i=StartRows+1;i<=EndRows;i++)
           {
               System.out.print(num[i][EndColumn]+" ,");
           }
           //bottom.
           for(int i=EndColumn-1;i>=StartColumn;i--)
           {
               if(EndRows==StartRows)
               {
                   break;
               }

               System.out.print(num[EndRows][i]+" ,");
           }
           //left.
           for(int i=EndRows-1;i>=StartRows+1;i--)
           {

               if(EndColumn==StartColumn)
               {
                   break;
               }
               System.out.print(num[i][StartColumn]+" ,");
           }
           EndRows--;EndColumn--;StartColumn++;StartRows++;
        }
    }

    public static void Spiral2(int[][] num)
    {
        int StartRow=0,EndRow=num.length-1,StartColumn=0,EndColumn=num[0].length-1;
        while (StartColumn<=EndRow && StartColumn<=EndColumn)
        {
            for(int i=StartColumn;i<=EndColumn;i++)
            {
                System.out.print(","+num[StartRow][i]);
            }
            for(int i=StartRow+1;i<=EndRow;i++)
            {
                System.out.print(","+num[i][EndColumn]);
            }
            for (int i=EndColumn-1;i>=StartColumn;i--)
            {
                if(EndRow==StartRow)
                {
                    break;
                }
                System.out.print(","+num[EndRow][i]);
            }
            for(int i=EndRow-1;i>StartRow;i--)
            {
                if(StartColumn==EndColumn)
                {
                    break;
                }
                System.out.print(", "+num[i][StartColumn]);
            }
            EndRow--;EndColumn--;StartColumn++;StartRow++;
        }
    }
}

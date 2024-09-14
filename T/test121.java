public class test121 {
    public static void main(String[] arrgs)
    {
       int[] num={1,4,3,0,5,7};
       MergeSort(num,0,num.length-1);
       for(int i=0;i<num.length;i++)
       {
           System.out.print(num[i] + ", ");
       }

    }
    public static void SpiralCrap(int[][] num)
    {
        int StartColumn=0,StartRow=0,EndRow= num.length-1, EndColumn=num[0].length-1;
        /*  StartColumn
              |          |
              |          |
              v          |
StartRow----->1  2  3    4
              5  6  7    8
EndRow------>9  10  11  12  */


        while (StartRow<=EndRow && EndColumn>=StartColumn)
        {
            for(int i=StartColumn;i<=EndColumn;i++)
            {
                System.out.print(num[StartRow][i]+",");
            }
            for(int j=StartRow+1;j<=EndRow;j++)
            {
                System.out.print(num[j][EndColumn]+",");
            }
            for(int i=EndColumn-1;i>=StartColumn;i--)
            {
                if(EndRow==StartRow)
                {
                    return;
                }
                System.out.print(num[EndRow][i]+",");
            }
            for (int i=EndRow-1;i>=StartRow+1;i--)
            {
                if(StartColumn==EndColumn)
                {
                    return;
                }
                System.out.print(num[i][StartColumn]+",");
            }
            EndRow--;EndColumn--;StartRow++;StartColumn++;
        }
    }
    public static void MergeSort(int[] num,int s,int e) {
        if (s >= e) {
            return;
        }
            int mid = s + (e - s) / 2;
            MergeSort(num, s, mid);
            MergeSort(num, mid + 1, e);
            merge(num, s, e, mid);

    }
        public static void merge(int[] num,int s,int e,int mid)
        {
            int[] array = new int[e-s+1];
            int i=s,j=mid+1,k=0;
            while (i<=mid && j<=e)
            {
                if(num[i]<num[j])
                {
                    array[k++]=num[i++];
                }else{
                    array[k++] = num[j++];
                }
            }
            while (i<=mid)
            {
                array[k++] = num[i++];
            }
            while (j<=e)
            {
                array[k++] = num[j++];
            }
            for (i=0,j=s;i<array.length;i++,j++)
            {
                num[j]=array[i];
            }
        }
    }



public class QuickSort {
    public static void Swap(int[] num, int s, int e)
    {
        int k=num[s];
        num[s]=num[e];
        num[e]=k;
    }
    public static void QuickSortFunction(int[] num,int StartingIndex,int EndingIndex)
    {
        if(StartingIndex>=EndingIndex)
        {
            return;
        }
        int PartitionIndex=Partition(num,StartingIndex,EndingIndex);
        QuickSortFunction(num,StartingIndex,PartitionIndex-1);
        QuickSortFunction(num,PartitionIndex+1,EndingIndex);
    }
    public static int Partition(int[] num,int Start,int End)
    {
        int pivot=num[End];
        int i=Start-1;
        for(int j=Start;j<End;j++)
        {
            if(num[j]<=pivot)
            {
                Swap(num,j,++i);
            }

        }
        Swap(num,++i,End);
        return i;
    }
    public static void main(String[] a)
    {
        int[] num={2,4,1,3,8,49,0,5};
        QuickSortFunction(num,0,num.length-1);
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ,");
        }
    }
}

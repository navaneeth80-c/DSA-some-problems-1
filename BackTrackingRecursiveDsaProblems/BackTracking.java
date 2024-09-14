public class BackTracking {
    public static void main(String[] n)
    {
        int[] num= new int[5];
        BackTrackIng(num,0,1);
        PrintArray(num);

    }
    public static void PrintArray(int[] num )
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+", ");
        }
    }
    public static void BackTrackIng(int[] num,int index,int value)
    {
        if(index==num.length)
        {
            PrintArray(num);
            return;
        }
        num[index]=value;
        BackTrackIng(num,index+1,value+1);
        num[index]=num[index]-2;
    }
}

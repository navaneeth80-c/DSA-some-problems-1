public class PairSum2 {

    public static void main(String[] s)
    {
        int[] num={11,15,6,8,9,10};
        PairSumRotatedArray(num,25);

    }
    public static void PairSum2(int[] num,int target)
    {
        int StartingIndex=0,EndingIndex=num.length-1, sum=0;
        while (StartingIndex<EndingIndex)
        {
           sum= num[StartingIndex]+num[EndingIndex];
            if(sum==target)
            {
                System.out.println("yes");
                return;
            }
            if(sum<target)
            {
                StartingIndex++;
            }else{
                EndingIndex--;
            }


        }
        System.out.println("no");
    }
    public static void PairSumRotatedArray(int[] num,int target)
    {

        int lPointer = MiddleIndexFinder(num,0,num.length-1)-1,RightPointer=lPointer+1;

        while (lPointer != RightPointer)
        {
            int sum= num[lPointer]+num[RightPointer];
            if( sum==target)
            {
                System.out.println("yes");
                return;
            }
            if(sum>target) {
                lPointer = (lPointer - 1+num.length) % num.length;
            }else{
                RightPointer=(RightPointer+1)%num.length;
            }
        }
        System.out.println("no");
    }
    public static int MiddleIndexFinder(int[] num,int Start,int End)
    {
        while (Start<End)
        {
            int middle = Start+(End-Start)/2;
            if(num[middle]<num[middle-1] && num[middle] < num[End])
            {
                return middle;
            }
            if(num[middle]>num[Start] && num[middle]>num[End])
            {
                Start=middle+1;
            }else{
                End=middle;
            }

        }
        return -1;
    }
}

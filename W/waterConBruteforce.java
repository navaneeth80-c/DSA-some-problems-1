public class waterConBruteforce {
    public static void main(String[] s)
    {
        int[] container={1,8,6,2,5,4,8,3,7};
        System.out.println(MaxCintainer(container));

    }
    public static int MaxCintainer(int[] num)
    {
        int index1=0,index2=0,maxL=0,MaxR=0;
        for(int i=0;i<num.length/2;i++)
        {
            if(maxL<num[i])
            {
                index1=i;
                maxL=num[i];
            }
            if(MaxR<num[num.length-i-1] && index2>=(num.length-i-1))
            {
                index2=num.length-i-1;
                MaxR=num[index2];
            }
        }
        return((index2-index1)*(Math.min(MaxR,maxL)));
    }
    
    
}

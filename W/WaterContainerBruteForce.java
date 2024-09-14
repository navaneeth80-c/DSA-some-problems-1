
public class WaterContainerBruteForce {
    public static void main(String[] s)
    {
        int[] container={1,8,6,2,5,4,8,3,7};
        System.out.println(WaterContainer3(container));

    }
    //aproach1
    public static int MaxCintainer(int[] num) {
        int index1 = 0, index2 = 0,sum=0, maxL = 0, MaxR = 0;
        for (int i = 0; i < num.length / 2; i++) {
            if (maxL < num[i] ) {
                index1 = i;
                maxL = num[i];
            }
            if (MaxR < num[num.length - i - 1]) {
                index2 = num.length - i - 1;
                MaxR = num[index2];
            }
           if(sum<(index2 - index1) * (Math.min(MaxR, maxL)))
           {
               sum=(index2 - index1) * (Math.min(MaxR, maxL));
           }
        }
        return sum ;
    }
    //aproach2
    public static int WaterContainer(int[] num)
    {
        int MaxLength,total=0,maxl=0,maxr=0;
        for(int i=0;i<num.length/2;i++)
        {
            maxl=Math.max(maxl,num[i]);
            maxr=Math.max(maxr,num[num.length-i-1]);
            MaxLength=Math.min(maxl,maxr);
            total= Math.max(   total,MaxLength * (num.length-(i*2)));
        }
                    return total;
    }

    //aproach3
    public  static int WaterContainer3(int[] num)
    {
        int LHeight=0,RHeight=num.length-1,totalHeight=0,indexDiff=0;
        while (LHeight<RHeight)
        {
            totalHeight=Math.max(totalHeight,Math.min(num[RHeight],num[LHeight]) *(RHeight-LHeight));
            if(num[RHeight] <num[LHeight])
            {
                RHeight--;
            }else{
                LHeight++;
            }

        }
        return totalHeight;

    }
}

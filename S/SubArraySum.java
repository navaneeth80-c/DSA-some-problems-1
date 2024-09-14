public class SubArraySum {
   public static void main(String[] arrgs)
   {
    int[] num={8,5,10,7,9,4,15,12,90,13};
    System.out.println(sum(num, 4));

   }
   public static int sum(int[] num,int key)
   {
    int sum=0;
    for(int i=0;i<=num.length - key;i++)    //notable point array.length will return maxIndex+1.
    {
        sum+=subArrayMax(num, i,i+key-1); //notable point.

    }
    System.out.println("sum: "+sum);
    return sum;

   } 
   public static int subArrayMax(int[] num,int start,int end)
   {
    printArray(num, start, end);
    int max=num[start];
    for(int i=start;i<=end;i++)
    {
        if(max<num[i])
        {
            max=num[i];
        }
    }
    System.out.println("max: "+max);
    return max;
   }

   public static void printArray(int[] num,int start,int end)
   {
    System.out.println("array elements");
    for(int i=start;i<=end;i++)
    {
        System.out.print(","+num[i]);
    }
    System.out.println();

   }
}

public class FindingTheLastOccuranceInTheArray {
    public static void main(String[] a)
    {
        int[] num={1,2,3,1,0,5};
        System.out.println(LastOccurence(num,2,num.length-1));

    }
    public static int LastOccurence(int[]num,int key,int n)
    {
        if(num[n]==key)
        {
            return n;
        }
        if(n==0)
        {
            return -1;
        }
    return LastOccurence(num,key,n-1);
    }

}

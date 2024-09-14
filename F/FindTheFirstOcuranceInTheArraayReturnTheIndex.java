public class FindTheFirstOcuranceInTheArraayReturnTheIndex {
    public static void main(String[] a)
    {
        int[] num={1,2,3,4,5};
        System.out.println(IndexOfTheKey(num,0,0));

    }
    public static int IndexOfTheKey(int[] num, int n,int key)
    {
        if (n==num.length) {
            return -1;
        }
        if(num[n]==key)
        {
            return n;
        }
        return IndexOfTheKey(num,n+1,key);
    }
}

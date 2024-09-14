public class CheckTheArrayIsSortedOrNot {
    public static void main(String[] a)
    {
        int[] num={1,2,3,1,4,5};
        //System.out.println(IsArraySorted(num));
        System.out.println(ArrayIsSortedOrNotRecursively(num,num.length-1));

    }
    public static boolean IsArraySorted(int[] num)
    {
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]>num[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean ArrayIsSortedOrNotRecursively(int[] num,int i) {
        if(i<=0)
        {
            return true;
        }
            if (num[i] < num[i - 1]) {
                return false;
            }
            return ArrayIsSortedOrNotRecursively(num, i - 1);

    }

}

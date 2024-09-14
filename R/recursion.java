public class recursion {
    public static void main(String[] arrgs)
    {
        int num=10;
        IncreasingOrder(num);
    }
    public static void IncreasingOrder(int num)
    {
        if(num==0)
        {
            System.out.println(num);
            return;
        }
        System.out.println(num+" ,");
        IncreasingOrder(num-1);
    }
    public static void DecreasingOrder(int num)
    {


        if(num<0)
        {
            return;
        }
        DecreasingOrder(num-1);

        System.out.println(num);

    }
}


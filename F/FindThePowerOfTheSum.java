public class FindThePowerOfTheSum {
    public static void main(String[] num)
    {
        System.out.println(PowerOf(2,10));
    }
    public static int PowerOf(int num,int pow)
    {
        if(pow==0)
        {
            return  1;
        }
        return (num*PowerOf(num,pow-1));
    }
}

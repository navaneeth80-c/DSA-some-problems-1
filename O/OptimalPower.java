public class OptimalPower {
    public static void main(String[] a)
    {
        System.out.println(Optimal2(2,10));
    }

//public static int WrongPower(int n,int m)
//{
//    if(m==0)
//    {
//        return 1;
//    }
//    if(m%2==0)
//    {
//        int n1=power(n,m/2);
//        return n1*n1;
//    }
//    if((m+1)%2==0)
//    {
//        int n1=n*power(n,(m-1)/2);
//        return n1*n1;
//    }
//    return power(n,m-1);
//
//}
    public static int PowerOptimal(int num,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int total = PowerOptimal(num,n/2)*PowerOptimal(num,n/2);
        if(n%2!=0)
        {
            return num*total;
        }
        return total;
    }
    public static int Optimal2(int n,int m)
    {
        if(m==0)
        {
            return 1;
        }
        int total=Optimal2(n,m/2)*Optimal2(n,m/2);
        if(m % 2 != 0)
        {
            return total*n;
        }
        return total;
    }
}

public class NthFibonaciNumber {
    public static void main(String[] arrgs)
    {
        int num=5;
       // System.out.println(fibo(num));
    }
    public static int fibo(int num)
    {
        if(num==0 || num==1)
        {
            return num;
        }
        //return (fibo(num-1)+fibo(num-2));
        int num1=fibo(num-1) +fibo(num-2); ;
        return num1;
    }
}

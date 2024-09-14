public class LeetCodeProblem2 {
    public static void main(String[] s)
    {
        String str = "cbacdcbc";
        System.out.println(LexicoOrder(str));
    }

    public static String LexicoOrder(String s)
    {



     return (s.substring(IndexReturn(s)));
    }

    public static int IndexReturn(String s)
    {
        int index=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if((int)s.charAt(i)>(int) s.charAt(s.length()-i-1))
            {
                index=s.length()-i-1;
            }else{
                index=i;
            }
        }
        return index-1;
    }
}

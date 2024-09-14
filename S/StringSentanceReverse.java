import java.util.Scanner;
public class StringSentanceReverse {
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(StringSentanceReversal(sc.nextLine()));
    }
    public static String StringSentanceReversal(String s)
    {
        StringBuilder sc = new StringBuilder(s.length());
        int start =0,end=s.length()-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                start=i+1;
                for(int j=start;j<=end;j++)
                {
                    sc.append(s.charAt(j));
                }
                sc.append(' ');
                end=start-1;
            }
        }
        for(int i=0;s.charAt(i) !=' ';i++)
        {
            sc.append(s.charAt(i));
        }
        return sc.toString();
    }
}

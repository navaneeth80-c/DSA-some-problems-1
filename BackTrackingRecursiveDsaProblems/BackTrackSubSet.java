import java.util.Scanner;
public class BackTrackSubSet {
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str =sc.nextLine();

        Bt(str,sb,0);
//String n="abc";
//BT(n," ",0);
    }
    public static void BT(String S,String Q,int i)
    {
        if(i==S.length())
        {
            System.out.println(Q);
            return;
        }
        BT(S,Q+S.charAt(i),i+1);
        BT(S,Q,i+1);
    }
    public static void Bt(String Str,StringBuilder STR,int i)
    {
        if(Str.length()==i)
        {
            System.out.print(STR);

            return ;

        }
        Bt(Str,STR.append(Str.charAt(i)),i+1);
        STR.deleteCharAt(STR.length()-1);
        Bt(Str,STR,i+1);
    }

}

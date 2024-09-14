//leetCodeJava.
//idea from merge sort.
public class MergeStringLeetCode {
    public static void main(String[] arr)
    {
        String s ="abcd",s1="pq";
        System.out.println(StringMerger(s,s1));
    }
    public static String StringMerger(String s,String s1)
    {
        StringBuilder sc = new StringBuilder(s.length()+s1.length()+200);
        int i=0,j=0;
        while (i<s.length() && j<s1.length())
        {
            sc.append(s.charAt(i++));
            sc.append(s1.charAt(j++));
        }
        while (i<s.length())
        {
            sc.append(s.charAt(i++));
        }
        while (j<s1.length())
        {
            sc.append(s1.charAt(j++));
        }
        return sc.toString();

    }
}

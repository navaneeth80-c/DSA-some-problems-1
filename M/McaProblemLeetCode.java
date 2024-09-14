public class McaProblemLeetCode {

    public static String StringSlicer(String s1,String s2)
    {
        StringBuilder s = new StringBuilder(s1.length());
        if(s1.charAt(0)==s2.charAt(0))
        {
            s.append(s1.charAt(0));
        }else{
            return s.toString();
        }
        for(int i=1;i<s1.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(s1.charAt(j) ==s2.charAt(i))
                {
                    return s.toString();
                }
            }
            s.append(s1.charAt(i));
        }
        return s.toString();
    }

    public String OptimalSol(String str1, String str2) {
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }

            int gcdLength = gcd(str1.length(), str2.length());
            return str1.substring(0, gcdLength);
        }

        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }


    public static void main(String[] a)
    {
        String s="123",s1="ABCDABCD";
        System.out.println(StringSlicer(s,s1));
    }
}



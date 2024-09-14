public class FindingThePermutaion {
    public static void main(String[] s)
    {
        Permutation("ABC","");
    }
    public static void Permutation(String Str,String newStr)
    {
        if(Str.isEmpty())
        {
            System.out.println(newStr);
            return;
        }
        for(int i=0;i<Str.length();i++)
        {
            char s= Str.charAt(i);
            String ans= Str.substring(0,i)+Str.substring(i+1); // note hear i gets excluded in the first substring function.
            Permutation(ans,s+newStr);
        }
    }
}

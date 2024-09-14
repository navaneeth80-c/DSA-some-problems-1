import java.util.*;
public class StringProblemPractice {
    public static void main(String[] arrgs)
    {
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println(StringLowerCaseCounter(name));

    }
    public static int StringLowerCaseCounter(String s)
    {
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
}

import java.util.ArrayList;


public class LeetCodeProblem1 {
    //problem url: https://leetcode.com/problems/occurrences-after-bigram/description/
 public static  void main(String[] arrgs)
 {
     String [] ans =Ocurance("alice is a good girl she is a good Student","a","good");
        for(String s : ans)
        {
            System.out.print(s+" ");
        }
 }
 public static String[] Ocurance(String text,String first,String Second)
 {
     ArrayList<String> stringArray = new ArrayList<> ();
     String [] stringSubArray = text.split(" ");
    int i=0;
    while(i<stringSubArray.length-2)
    {
        if(stringSubArray[i].equals(first) && stringSubArray[i+1].equals(Second))
        {
            stringArray.add(stringSubArray[i+2]);
        }
        i++;
    }
    return stringArray.toArray( new String[0]);
 }


}

import java.util.ArrayList;
public class PairSum {
    public static void main(String[] s)
    {
        ArrayList<Integer> num= new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(3);
        System.out.println(SumFunction(num,5));

    }

    public static ArrayList<Integer> SumFunction(ArrayList<Integer> num,int target)
    {
       ArrayList<Integer> Array= new ArrayList<>();
       int sumPoint=0;
       for(int i=0;i<num.size()-1;i++)
       {
           for(int j= i+1;j<num.size();j++)
           {
               int sum=num.get(i)+num.get(j);
               if(sum==target)
               {
                   Array.add(num.get(i));
                   Array.add(num.get(j));
                   return Array;
               }

           }




       }
       return Array;

    }
}

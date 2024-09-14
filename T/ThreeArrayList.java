import java.util.*;
public class ThreeArrayList {
    public static void main(String[] a)
    {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        MainList.add(list1);MainList.add(list2);MainList.add(list3);
        for(int j=0;j<MainList.size();j++)
        {
            ArrayList<Integer>Current=MainList.get(j);
            for(int i=0;i<Current.size();i++)
            {
                System.out.print(Current.get(i)+" ");
            }
            System.out.println();
        }
        System.out.println(MainList);
    }
}

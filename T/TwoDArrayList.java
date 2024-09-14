import java.util.ArrayList;
import java.util.Collections;
public class TwoDArrayList {
    public static void main(String[] a)
    {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(4);  list.add(1);
        ArrayList<Integer> List2 = new ArrayList<>();
       // MainList.add(list);
        list.add(3);list.add(2);
        MainList.add(list);
        List2.add(12);List2.add(34);List2.add(45);
        MainList.add(List2);
        System.out.println(MainList);
        for(int i=0;i<MainList.size();i++)
        {
            ArrayList<Integer> Current= MainList.get(i);
            Collections.sort(Current);
            for(int j=0;j<Current.size();j++)
            {
                System.out.println(Current.get(j));
            }
        }
    }
}

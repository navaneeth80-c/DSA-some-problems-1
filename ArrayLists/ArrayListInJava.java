import java.util.ArrayList;
//import java.util.Collections;
public class ArrayListInJava {
    public static void main(String[] s)
    {
//        ArrayList<Integer> List1 = new ArrayList<>();
//        for(int i=0;i<=10;i++)
//        {
//            List1.add(i);
//        }
//        System.out.println(List1);
////        for(int i=0;i<=10;i++)
////        {
////            List1.remove(0);
////        }
//       // System.out.println(List1.remove(3));
//        List1.set(0, 10);
//        System.out.println( List1.get(7));
//        System.out.println(List1);
//        System.out.println(List1.contains(10));
        //list traversal.
//            ArrayList<Integer> List2= new ArrayList<>();
//            List2.add(12);
//            List2.add(13);
//            List2.add(14);
//            for(int i=List2.size()-1;i>=0;i--){
//                System.out.print(List2.get(i)+" , ");
//            }
//            List2.re;
//        System.out.println(List2);
        ArrayList<Integer> List3 = new ArrayList<>();
        List3.add(10);
        List3.add(3);
        List3.add(2);
        List3.add(-2);
        List3.add(90);
        List3.add(0);
//        int MaxNum=Integer.MIN_VALUE;
//        int MinNum=Integer.MAX_VALUE;
//        for(int i=0;i<List3.size();i++)
//        {
//            if(List3.get(i)>MaxNum)
//            {
//                MaxNum=List3.get(i);
//            }
//            if(List3.get(i)<MinNum)
//            {
//                MinNum=List3.get(i);
//            }
//        }
//        System.out.println(MaxNum+" , "+MinNum);
        System.out.println(List3);
        SwapOfTwoNumber(List3,0,4);
       // Collections.sort(List3); Asending order.
      //  Collections.sort(List3,Collections.reverseOrder());

        System.out.println(List3);
    }
    public static void  SwapOfTwoNumber(ArrayList<Integer> list,int a,int b)
    {
       int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
}

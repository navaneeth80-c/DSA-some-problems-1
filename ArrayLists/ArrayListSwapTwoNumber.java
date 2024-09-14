import java.util.ArrayList;
public class ArrayListSwapTwoNumber {
    public static void main(String[] s)
    {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        System.out.println("before Swap");
        System.out.println(List);
        SwapOfTwoNumber(List,4,0);
        System.out.println(List);
    }
    public static  void SwapOfTwoNumber(ArrayList<Integer> list,int num1,int num2)
    {
        int temp= list.get(num1);
        list.set(num1,list.get(num2));
        list.set(num2,temp);
    }
}

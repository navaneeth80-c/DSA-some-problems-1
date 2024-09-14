import java.util.ArrayList;

public class WaterContainerBruteForce2 {
    public static  void main(String[] s)
    {
        int[] height={1,8,6,2,5,4,8,3,7};
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<height.length;i++)
        {
            array.add(height[i]);
        }
        System.out.println(totalWater(array));

    }
    public static int totalWater(ArrayList<Integer> array)
    {
        int ht=0,width=0,total=0;
        for(int i=0;i<array.size()-1;i++)
        {
            for(int j=i+1;j<array.size();j++)
            {
                ht=Math.min(array.get(i),array.get(j));
                width=j-i;
                total=Math.max(total,(ht * width));

            }}
            return total;

        }

    }


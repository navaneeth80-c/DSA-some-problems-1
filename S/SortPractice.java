public class SortPractice
{
    public static void main(String[] s)
    {
       
       
        int[] num={10,4,3,2,1,56,3,34,23};
        ArrayPrint(num);
        InsertionSort(num);
        ArrayPrint(num);
     }
    public static void bubbleSort(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length-1-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    Swap(num, j,j+1);
                }
            }
        }
    }
    public static void Swap(int[] num,int i,int j)
    {
        int k=num[i];
        num[i]=num[j];num[j]=k;
    }
    public static void ArrayPrint(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.print(" "+num[i]+",");
        }
        System.out.println();
    }
    public static void selectionSort(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            int min=i;
            for(int j=i+1;j<num.length;j++)
            {
                if(num[min]>num[j])
                {
                    min=j;
                }
            }
            Swap(num, i, min);
        }
    }
    public static void InsertionSort(int[] num)
    {
        for(int i=1;i<num.length;i++)
        {
            int prev =i-1;
            int current=num[i];
            while (prev>=0 && num[prev]>current)
             {
                num[prev]=num[prev+1];prev--;
                
            }
            num[prev+1]=current;
        }
    }
}
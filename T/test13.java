public class test13 {
    public static void main(String[] a)
    {
//        int[] num={6,3,9,8,2,5,-5};
//       // MergeSort(num,0,num.length-1);
//        QuickSort(num,0,num.length-1);
//        for(int i=0;i<num.length;i++)
//        {
//            System.out.print(num[i]+" , ");
//        }
//        int[] num={5,6,7,0,1,2,3};
//        System.out.println(Ms(num,0,num.length-1,6));
        String s= "abc";
        String n="";
        System.out.println(n+s.charAt(10));
    }
    public static void MergeSort(int[] num,int Start,int End)
    {
        if (Start>=End) {
            return;
        }

            int mid=Start+(End-Start)/2;
            MergeSort(num,Start,mid);
            MergeSort(num,mid+1,End);
            Merge(num,Start,End,mid);

    }
    public static void Merge(int[] num,int Start,int End,int Mid)
    {
        int[] Array= new int[End-Start+1];
        int i=Start,j=Mid+1,k=0;
        while (i<=Mid && j<=End)
        {
            if (num[i]<num[j])
            {
                Array[k++]=num[i++];
            }else{
                Array[k++]=num[j++];
            }
        }
        while (i<=Mid)
        {
            Array[k++]=num[i++];
        }
        while (j<=End)
        {
            Array[k++]=num[j++];
        }

        for(i=0,j=Start;i<Array.length;i++,j++)
        {
            num[j]=Array[i];
        }
    }
    public static void QuickSort(int[] num,int Start,int End)
    {
        if(Start >=End)
        {
            return;
        }
        int position=Partition(num,Start,End);
        QuickSort(num,Start,position-1);
        QuickSort(num,position+1,End);

    }
    public static int Partition(int[] num,int Start,int end)
    {
        int Pivot=num[end];
        int i=Start-1;
        for(int j=Start;j<end;j++)
        {
            if(num[j]<=Pivot)
            {
                Swap(num,++i,j);
            }
        }
        Swap(num,++i,end);
        return i;
    }
    public static void Swap(int[] num,int i,int j)
    {
        int k=num[i];
        num[i]=num[j];
        num[j]=k;
    }
    public static int ModifiedBinarySearch(int[] num,int S,int E,int T)
    {
        //S-Start,E-End,T-Target.
        if(S>E)
        {
            return -1;
        }
        int mid=S+(E-S)/2;
        if(num[mid]==T)
        {
            return mid;
        }
        if(num[mid]>=num[S])
        {
            if(num[mid]>=T && num[S]<=T)
            {
                return ModifiedBinarySearch(num,S,mid-1,T);
            }else{
                return ModifiedBinarySearch(num,mid+1,E,T);
            }
        }else{
            if(num[mid]<=T && T<=num[E])
            {
                return ModifiedBinarySearch(num,mid+1,E,T);
            }else{
                return ModifiedBinarySearch(num,S,mid-1,T);
            }
        }
    }
    public static int Ms(int[] num,int S,int E,int Key)
    {
       if(S>E)
       {
           return -1;
       }
       int mid =S+(E-S)/2;
       if(num[mid]==Key)
       {
           return mid;
       }
       if(num[mid]>=num[S])
       {
           if(num[mid]>Key && Key >=num[S] )
           {
               return Ms(num,S,mid-1,Key);
           }else{
               return Ms(num,mid+1,E,Key);
           }
       }else{
           if(num[mid]<Key && Key <=num[E])
           {
               return Ms(num,mid+1,E,Key);
           }else{
               return Ms(num,S,mid-1,Key);
           }
       }
    }
    public static void Permutation(String S,String s)
    {
        if(S.isEmpty())
        {
            System.out.println(s);
            return;
        }
        for(int i=0;i<S.length();i++)
        {
            char A = S.charAt(i);
            String P=S.substring(0,i)+S.substring(i+1);
            Permutation(P,A+P);
        }
    }
}

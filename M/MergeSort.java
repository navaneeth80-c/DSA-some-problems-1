public class MergeSort
{



    public static void main(String[] arrgs)
    {
        int[] num={10,3,5,2,4,3,5,2,0,7,39,5};
        msort(num,0,num.length-1);
        
        
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ,");
        }

    }
    
    
    public static void Mergesort(int[] num, int start,int end)
    {
    
        if(start>=end)
        {
            return;
        }
    
       int mid=start+(end-start)/2;

       Mergesort(num,mid+1,end);
       Mergesort(num,start,mid);
       merge(num,start,end,mid);
    
    }
    
    
    
    public static void merge(int[] num , int start,int end,int mid) 
    {
    
        int[] array = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
    
        while (i <= mid && j <= end) 
        {
            if (num[i] < num[j])
            {
                array[k++] = num[i++];
            } else
            {
                array[k++] = num[j++];
            }
        }
        while (i <= mid)
        {
            array[k++] = num[i++];
        }
        while (j <= end) 
        {
            array[k++] = num[j++];
        }

        for ( k = 0,i=start; k<array.length;k++,i++ )
        {
            num[i]=array[k];
        }
    }
   
   
   
   
   public static void msort(int[] num , int start,int end)
   {
      if (start>=end)
      {
            return;
      }
           int mid=start+(end-start)/2;
      	   msort(num,start,mid);
           msort(num,mid+1,end);

           m(num,start,end,mid);
   
   }
   
   
   
   
   
   public static void m(int[] num,int start,int end,int mid)
   {
   
      
      
       int[] array = new int[end-start+1];
       int i=start,j=mid+1,k=0;
   
   
       while (i<=mid && j<=end)
       {
      
      
      
           if(num[i]<num[j])
           {
               array[k++]=num[i++];
      
           }else
           {
               array[k++]=num[j++];
           }
       
       
       }
       
       
       
       while (i<=mid)
       {
       
       
           array[k++]=num[i++];
       
       
       }
       
       
       while (j<=end)
       {
       
           array[k++]=num[j++];
       
       }
       
       
       for (i=0,j=start;i<array.length;i++,j++)
       
       {
       
           num[j]=array[i];
       
       }
   
   }

}

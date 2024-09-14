public class RotedSortedArraySearch {
    public static void main(String[] A)
    {
int[] num={4,5,6,7,0,1,2};
       // System.out.println(Search(num,0,num.length-1,0));
        System.out.println(RotatedSearch(num,0,num.length-1,2)+1);
    }
    public static int Search(int[] num,int S,int E,int Target)
    {
        if(S>E)
        {
            return -1;
        }
        int mid=S+(E-S)/2;
        if(num[mid]==Target)
        {
            return mid;
        }

        if(num[mid]>=num[S])
        {
            if(num[mid]>=Target && num[S]<=Target)
            {
                return Search(num,S,mid-1,Target);
            }else{
                return Search(num,mid+1,E,Target);
            }
        }else {
           if(num[mid]<=Target && num[E]>=Target)
           {
               return Search(num,mid+1,E,Target);
           }else {
               return Search(num,S,mid-1,Target);
           }
        }
    }
    public static int UsingItaration(int[] num,int S,int E,int T)
    {
        for(int i=S;i<=E/2;i++)
        {
            if(num[i]==T)
            {
                return i;
            } else if (num[E-i]==T) {
                return (E-i);

            }
        }
        return -1;
    }
    public static int RotatedSearch(int[] num,int S,int E,int key)
    {
        if(S>E)
        {
            return -1;
        }
        int mid=S+(E-S)/2;
        if(num[mid]==key)
        {
            return mid;
        }
        if(num[mid]>=num[S])
        {
            if(num[mid]>key && key >=num[S])
            {
                return RotatedSearch(num,S,mid-1,key);
            }else{
                return RotatedSearch(num,mid+1,E,key);
            }
        }else {
            if(num[mid]<key && num[E]>=key )
            {
                return RotatedSearch(num,mid+1,E,key);
            }else
            {
                return RotatedSearch(num,S,mid-1,key);
            }
        }
    }
}
//in this problem note onr thing that there is a possibity that there may exist smaller or larger number after the mid
//so first we check only for the confirmed area in the first if after mid there may exist more larger number than the mid
//but we are conserned with finding the key element so we are only searching the area that is clean .
public class SearchInTheSorted2DArray {
    public static void main(String[] arrgs)
    {
        int [][] num={{10,20,30,40}
                     ,{15,25,35,45}
                     ,{27,29,37,48}
                     ,{32,33,39,50}
                                };

        int[][] num2={{1,2,3,4,5,6},{7,8,9,10,11,13}};
       // BruteForce1(num,12);
        //optimal1(num,13);
        //System.out.println(StareCaseSearch(num,32));
        ReverseCaseStareCaseSearch(num2,6);
    }
    public static void BruteForce1(int[][] num,int key)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                if(num[i][num[0].length-(num[0].length+j)]==key)
                {
                    System.out.println("keys get found in."+i+" , "+j);
                    return;
                }

            }

        }
        System.out.println("key is not present.");
    }
    public static void optimal1(int[][] num,int key) {
        for(int i=0;i<num.length;i++)
        {
            if(num[i][num[0].length-1]>=key)
            {
                for(int j=0;j<num[0].length;j++)
                {
                    if(num[i][j]==key)
                    {
                        System.out.println("present.");
                        return;

                    }
                }
            }
        }
            System.out.println("no");


    }
    public static boolean StareCase(int[][] num,int key)
    {
        int start=0,end=num[0].length-1;

        while (0<=end && start<=num[0].length-1)
        {
            if(num[start][end]== key)
            {
                return true;
            } else if (num[start][end]<key) {
                start++;
            } else if (num[start][end]>key) {
                end--;
            }
        }
        return false;
    }

    public static boolean StareCaseSearch(int[][] num,int key)
    {
        //if you go row wise number decreases as you go vertically downwards number decreases.
        int row=0,column=num[0].length-1;
        while (row<=num[0].length-1 && column>=0)
        {
            if(num[row][column]==key)
            {
                return true;
            } else if (num[row][column]>key) {
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void ReverseCaseStareCaseSearch(int[][] num,int key)
    {
        int start=num.length-1,end=0;

        while (start>=0 && end<=num[0].length-1)
        {
            if(num[start][end]==key){
                System.out.println("true");
                return;
            }else if(num[start][end]>key)
            {
                start--;
            }else{
                end++;
        }
        }
        System.out.println("failed to find the key.!!!");
    }

    }


public class test2 {
    public static void main(String[] s) {
        int[] num = {11,126,8,9,10,11,11};
        System.out.println(MidOfTheArray(num,0,num.length-1));
    }

    public static int MidOfTheArray(int[] num, int Start, int End) {
        while (Start < End) {
            int mid = Start + ((End - Start) / 2);
            if (num[mid] < num[mid - 1] && num[mid] < num[End]) {
                return mid;

            }
            if (num[mid] > num[Start] && num[mid] > num[End]) {
               // return MidOfTheArray(num, mid + 1, End);
                Start=mid+1;
            } else {
                //return MidOfTheArray(num, Start, mid - 1);
                End=mid;
            }


        }
        return -1;
    }
}

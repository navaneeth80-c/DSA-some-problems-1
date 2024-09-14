public class StringTest {
    public static void main(String[] a) {
//        String name = "nank";
//        for (int i = 0; i < name.length(); i++) {
//            System.out.println(name.toLowerCase());
//        }
//       if( palindrome(name))
//       {
//           System.out.println("its a palindrome");
//       }else {
//           System.out.println("its not a palindrome.");
//       }
       // String name="WNEENESENNN";
        //ShortestRoute(name);
        //System.out.println(SubStringReplication(name,3,7));
//    String name="hello";
//    String Name="hella";
//        System.out.println(name.compareTo(Name));
        String name="hello my name is navaneeth k iam a S.D.E at timarizu.inc !!! thankyo ";
        System.out.println(StringCompressor(name));

    }
        public static boolean palindrome(String name)
        {
                for(int i=0;i<name.length()/2;i++)
                {
                    if(name.charAt(i)!=name.charAt(name.length()-1-i))
                    {
                        return false;
                    }

                }
                return true;
        }
        public static void ShortestRoute(String A)
        {
            int x=0,y=0;
            for(int i=0;i<A.length();i++)
            {
                char b= A.charAt(i);
                if(b=='N')
                {
                    y++;
                } else if (b=='E') {
                    x++;
                } else if (b=='S') {
                    y--;

                } else if (b=='W')
                {
                    x--;
                }
            }
            int num= (int)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            System.out.println(num);
        }
        public static String SubStringReplication(String str,int i,int j)
        {
            String Sub=" ";
            if(i<0 || i>str.length()-1||j>str.length()-1)
            {
                return ("invalid");
            }else{
                for(int k=i;k<=j-1;k++)
                {
                 Sub+=str.charAt(k);
                }}
         return Sub;
        }
//        public static void LargestOfTheString(String[] array)
//        {
//            String Max=array[0];
////            for(int i=1;i< array.length;i++)
////            {
////                if(Max.compareTo(Max,array[i])<0)
////                {
////
////                }
//
//            }
//        }
    public static StringBuilder uppercaseConverter(String s)
    {
        StringBuilder sc= new StringBuilder(" ");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' &&  i<s.length()-2 && s.charAt(i+1)!=' ' )
            {
                sc.append(s.charAt(i));

                sc.append(Character.toUpperCase(s.charAt(++i)));
            }else if(i==0)
            {
                sc.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sc.append(s.charAt(i));
            }


        }
        return sc;
    }
    public static StringBuilder StringCompressor(String s)
    {
        StringBuilder sc =new StringBuilder(" ");

        for(int i=0;i<s.length();i++)
        {
            int Intcounter=1;
            if(s.charAt(i)==' ')
            {
                sc.append('_');
            }
            while (i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                i++;Intcounter++;
            }
            sc.append(s.charAt(i));
            if(Intcounter!=1)
            {
                sc.append(Intcounter);
            }


        }
        return sc;

    }

    }


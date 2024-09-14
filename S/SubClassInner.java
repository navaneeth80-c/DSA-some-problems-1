public class SubClassInner {
    public static void main(String[] arrgs)
    {
//        Collage1.StudentNumber=10;
//        Collage1.StudentName="ben";
//        Collage1.Student1.Display();
        Collage1 Col = new Collage1();





    }

}

  class Collage1{
    static int StudentNumber;
    static String StudentName;
     int Class;
    static class Student1{
       static Collage1 sc = new Collage1();
         void Display()
         {
             System.out.println("name:  "+StudentName+"\nstudent number:  "+"\n class: "+ sc.Class);
         }
     }
     class Bank
     {
         int BankNo,BankIfcCode;
         String name;
         class SubBank
         {
             Bank b =new Bank();
             void Display(String name,int no1, int num2)
             {
                 b.BankNo=no1;b.BankIfcCode=num2;b.name=name;
                 System.out.println("name: "+b.name);

             }

         }
     }


        }
